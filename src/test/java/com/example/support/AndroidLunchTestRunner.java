package com.example.support;

import org.junit.runners.model.InitializationError;
import org.robolectric.RobolectricTestRunner;

public class AndroidLunchTestRunner extends RobolectricTestRunner {
  public AndroidLunchTestRunner(Class<?> testClass) throws InitializationError {
    super(testClass);
  }
}
