package com.example.pivotal.activity;

import android.app.Activity;
import android.os.Bundle;
import com.example.AndroidLunchApplication;

public abstract class BaseActivity extends Activity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    ((AndroidLunchApplication) getApplication()).inject(this);
  }
}
