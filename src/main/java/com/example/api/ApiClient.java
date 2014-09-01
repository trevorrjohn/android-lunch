package com.example.api;

import com.example.BuildConfig;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

public interface ApiClient {
  @POST("/qpx-express/v1/trips/search?key=" + BuildConfig.API_KEY)
  public void search(@Body FlightRequest request, Callback<FlightResponse> callback);
}
