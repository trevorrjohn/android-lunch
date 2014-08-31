package com.example.api;

import com.example.BuildConfig;
import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.POST;

public interface ApiClient {
  @POST("/qpxExpress/v1/trips/search?kay=" + BuildConfig.API_KEY)
  public void find(@Body SearchRequest request, Callback<SearchResponse> callback);
}
