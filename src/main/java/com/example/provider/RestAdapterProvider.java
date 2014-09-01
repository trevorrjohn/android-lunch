package com.example.provider;

import com.example.BuildConfig;
import retrofit.RestAdapter;

import javax.inject.Provider;

public class RestAdapterProvider implements Provider<RestAdapter> {
  @Override
  public RestAdapter get() {
    return new RestAdapter.Builder()
        .setEndpoint("https://www.googleapis.com")
        .setLogLevel(BuildConfig.DEBUG ? RestAdapter.LogLevel.FULL : RestAdapter.LogLevel.NONE)
        .build();
  }
}
