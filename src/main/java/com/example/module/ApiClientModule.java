package com.example.module;

import com.example.AndroidLunchModule;
import com.example.api.ApiClient;
import com.example.pivotal.activity.AndroidLunchActivity;
import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

import javax.inject.Inject;

@Module(
    includes = {AndroidLunchModule.class},
    injects = AndroidLunchActivity.class,
    complete = false,
    library = true
)
public class ApiClientModule {
  @Inject RestAdapter restAdapter;

  @Provides ApiClient providesApiClient() {
    return restAdapter.create(ApiClient.class);
  }
}
