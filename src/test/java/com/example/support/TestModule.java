package com.example.support;

import android.webkit.CookieManager;
import com.example.AndroidLunchModule;
import com.example.AndroidModule;
import com.example.activity.AndroidLunchActivityTest;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

import static org.mockito.Mockito.mock;

@Module(
    injects = {AndroidLunchActivityTest.class},
    includes = {AndroidModule.class, AndroidLunchModule.class},
    overrides = true
)
public class TestModule {
  @Provides
  @Singleton
  CookieManager provideMockCookieManager() {
    return mock(CookieManager.class);
  }
}
