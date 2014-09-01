package com.example.activity;

import com.example.api.ApiClient;
import com.example.api.FlightRequest;
import com.example.pivotal.AndroidLunchActivity;
import com.example.support.AndroidLunchTestRunner;
import com.example.support.InjectMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import retrofit.Callback;

import static org.mockito.Matchers.isA;
import static org.mockito.Mockito.verify;

@RunWith(AndroidLunchTestRunner.class)
public class AndroidLunchActivityTest {
  @InjectMock ApiClient apiClient;

  private AndroidLunchActivity subject;

  @Before
  public void setUp() throws Exception {
    subject = Robolectric.setupActivity(AndroidLunchActivity.class);
  }

  @Test
  public void onResume_requestsFlightDetails() {
    verify(apiClient).search(isA(FlightRequest.class), isA(Callback.class));
  }
}
