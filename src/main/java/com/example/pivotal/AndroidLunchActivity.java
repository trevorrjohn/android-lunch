package com.example.pivotal;

import android.os.Bundle;
import android.text.format.DateFormat;
import android.util.Log;
import com.example.R;
import com.example.api.ApiClient;
import com.example.api.FlightRequest;
import com.example.api.FlightResponse;
import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;
import roboguice.activity.RoboActivity;

import javax.inject.Inject;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

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

    String dateString = "2015-01-01";
    Date date = null;
    try { date = new SimpleDateFormat("yyyy-MM-dd").parse(dateString); } catch (ParseException ignored) { }
    FlightRequest flightRequest = FlightRequest.newRequest(
        "DTW", "LGA", date, 1, 300, "USD", false, 10
    );

    apiClient.search(flightRequest, new Callback<FlightResponse>() {
      @Override
      public void success(FlightResponse flightResponse, Response response) {
        Log.i("RESPONSE", flightResponse.toString());
      }

      @Override
      public void failure(RetrofitError retrofitError) {
        Log.e("RESPONSE", retrofitError.getMessage());
      }
    });
  }
}
