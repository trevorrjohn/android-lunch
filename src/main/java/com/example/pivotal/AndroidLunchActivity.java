package com.example.pivotal;

import android.os.Bundle;
import com.example.R;
import com.example.api.ApiClient;
import com.example.api.FlightRequest;
import com.example.api.FlightResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import roboguice.activity.RoboActivity;

import javax.inject.Inject;
import java.util.Date;

public class AndroidLunchActivity extends RoboActivity {
  @Inject ApiClient apiClient;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.lunch);
  }

  @Override
  protected void onResume() {
    super.onResume();

    FlightRequest flightRequest = FlightRequest.newRequest(
        "DTW", "LGA", new Date(20012l), 1, 300, "USD", false, 10
        );

    apiClient.search(flightRequest, new Callback<FlightResponse>() {
      @Override
      public void success(FlightResponse flightResponse, Response response) {

      }

      @Override
      public void failure(RetrofitError retrofitError) {

      }
    });
  }
}
