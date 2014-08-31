package com.example;

import com.example.pivotal.activity.AndroidLunchActivity;
import dagger.Module;
import dagger.Provides;
import retrofit.RestAdapter;

@Module(
    injects = AndroidLunchActivity.class,
    complete = false,
    library = true
)
public class AndroidLunchModule {
  @Provides RestAdapter providesRestAdapter() {
    return new RestAdapter.Builder()
        .setEndpoint("https://www.googleapis.com")
        .build();
  }
}
