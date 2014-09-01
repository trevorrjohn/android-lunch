package com.example.api;

import com.example.BuildConfig;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.Headers;
import retrofit.http.POST;

public interface ApiClient {
  @Headers({
      "Content-Type: application/json"
  })
  @POST("/qpxExpress/v1/trips/search?key=" + BuildConfig.API_KEY + "&prettyPrint=false")
  public void search(@Body FlightRequest request, Callback<FlightResponse> callback);
}
