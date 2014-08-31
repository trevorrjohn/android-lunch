package com.example;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

@Module(library = true)
public class AndroidModule {
  private final AndroidLunchApplication application;

  public AndroidModule(AndroidLunchApplication application) {
    this.application = application;
  }

  @Provides
  @Singleton
  @ForApplication
  Context provideApplicationContext() {
    return application;
  }

  @Provides
  SharedPreferences provideSharedPreferences() {
    return PreferenceManager.getDefaultSharedPreferences(application);
  }
}
