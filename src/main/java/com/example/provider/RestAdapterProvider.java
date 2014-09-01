package com.example.provider;

import retrofit.RestAdapter;

import javax.inject.Provider;

public class RestAdapterProvider implements Provider<RestAdapter> {
  @Override
  public RestAdapter get() {
    return new RestAdapter.Builder()
        .setEndpoint("https://developers.google.com")
        .build();
  }
}
