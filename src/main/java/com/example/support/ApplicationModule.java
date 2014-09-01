package com.example.support;

import com.example.api.ApiClient;
import com.example.provider.ApiClientProvider;
import com.example.provider.RestAdapterProvider;
import com.google.inject.AbstractModule;
import retrofit.RestAdapter;

public class ApplicationModule extends AbstractModule {
  @Override
  protected void configure() {
    bind(ApiClient.class).toProvider(ApiClientProvider.class);
    bind(RestAdapter.class).toProvider(RestAdapterProvider.class);
  }
}
