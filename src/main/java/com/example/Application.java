package com.example;

import com.example.support.ApplicationModule;
import roboguice.RoboGuice;
import roboguice.config.DefaultRoboModule;

public class Application extends android.app.Application {

  @Override
  public void onCreate() {
    super.onCreate();
    ApplicationModule applicationModule = new ApplicationModule();
    DefaultRoboModule defaultRoboModule = RoboGuice.newDefaultRoboModule(this);
    RoboGuice.setBaseApplicationInjector(this, RoboGuice.DEFAULT_STAGE, defaultRoboModule, applicationModule);
  }
}
