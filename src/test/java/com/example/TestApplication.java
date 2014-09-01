package com.example;

import com.example.support.ApplicationModule;
import com.example.support.InjectMockAnnotations;
import com.example.support.InjectMockModule;
import com.example.support.TestApplicationModule;
import com.google.inject.Module;
import com.google.inject.util.Modules;
import org.mockito.MockitoAnnotations;
import org.robolectric.TestLifecycleApplication;
import roboguice.RoboGuice;

import java.lang.reflect.Method;

@SuppressWarnings("unused")
public class TestApplication extends Application implements TestLifecycleApplication {
  @Override
  public void beforeTest(Method method) { }

  @Override
  public void prepareTest(Object test) {
    InjectMockModule mockModule = new InjectMockModule();
    InjectMockAnnotations.initInjectMocks(test.getClass(), mockModule, test);

    Module overriddenModule = Modules.override(new ApplicationModule()).with(new TestApplicationModule());
    overriddenModule = Modules.override(overriddenModule).with(mockModule);

    RoboGuice.setBaseApplicationInjector(
        this,
        RoboGuice.DEFAULT_STAGE,
        RoboGuice.newDefaultRoboModule(this),
        overriddenModule
    );

    RoboGuice.getInjector(this).injectMembers(test);
    MockitoAnnotations.initMocks(test);
  }

  @Override
  public void afterTest(Method method) {
    RoboGuice.destroyInjector(this);
  }
}
