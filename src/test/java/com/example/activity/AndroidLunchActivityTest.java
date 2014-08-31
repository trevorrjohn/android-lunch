package com.example.activity;

import android.app.Activity;
import com.example.pivotal.activity.AndroidLunchActivity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(RobolectricTestRunner.class)
public class AndroidLunchActivityTest {

    @Test
    public void testSomething() throws Exception {
        Activity activity = Robolectric.buildActivity(AndroidLunchActivity.class).create().get();
        assertTrue(activity != null);
    }
}
