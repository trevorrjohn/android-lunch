package com.example;

import com.example.support.TestModule;
import org.robolectric.TestLifecycleApplication;

import java.lang.reflect.Method;
import java.util.List;

@SuppressWarnings("unused")
public class TestAndroidLunchApplication extends AndroidLunchApplication implements TestLifecycleApplication {

  @Override
  protected List<Object> getModules() {
    List<Object> modules = super.getModules();
    modules.add(new TestModule());
    return modules;
  }

  @Override
  public void beforeTest(Method method) {

  }

  @Override
  public void prepareTest(Object o) {
    inject(o);
  }

  @Override
  public void afterTest(Method method) {

  }
}
