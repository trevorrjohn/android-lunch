package com.example.activity;

import android.app.Activity;
import android.webkit.CookieManager;
import com.example.pivotal.activity.AndroidLunchActivity;
import com.example.support.AndroidLunchTestRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;

import javax.inject.Inject;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidLunchTestRunner.class)
public class AndroidLunchActivityTest {

  @Inject CookieManager cookieManager;

  @Test
  public void injectionWorks() {
    assertNotNull(cookieManager);
  }

  @Test
  public void testSomething() throws Exception {
    Activity activity = Robolectric.buildActivity(AndroidLunchActivity.class).create().get();
    assertTrue(activity != null);
  }
}
