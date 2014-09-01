package com.example.activity;

import android.app.Activity;
import com.example.model.Foo;
import com.example.pivotal.AndroidLunchActivity;
import com.example.support.AndroidLunchTestRunner;
import com.example.support.InjectMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.Robolectric;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(AndroidLunchTestRunner.class)
public class AndroidLunchActivityTest {
  @InjectMock Foo foo;

  @Test
  public void testSomething() throws Exception {
    Activity activity = Robolectric.buildActivity(AndroidLunchActivity.class).create().get();
    assertTrue(activity != null);
  }

  @Test
  public void injectMock() {
    Mockito.stub(foo.isTrue()).toReturn(false);
    assertFalse(foo.isTrue());
  }
}
