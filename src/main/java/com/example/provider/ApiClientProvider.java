package com.example.provider;

import com.example.api.ApiClient;
import retrofit.RestAdapter;

import javax.inject.Inject;
import javax.inject.Provider;

public class ApiClientProvider implements Provider<ApiClient> {
  @Inject RestAdapter restAdapter;

  @Override
  public ApiClient get() {
    return restAdapter.create(ApiClient.class);
  }
}
