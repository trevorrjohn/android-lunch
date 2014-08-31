package com.example.pivotal.activity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Toast;
import com.example.R;

import javax.inject.Inject;

public class AndroidLunchActivity extends BaseActivity {
  @Inject SharedPreferences sharedPreferences;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.lunch);
    sharedPreferences.edit().putBoolean("foo", true).apply();
  }

  @Override
  protected void onResume() {
    super.onResume();
    if (sharedPreferences.getBoolean("foo", false)) {
      Toast.makeText(this, "It worked!", Toast.LENGTH_SHORT).show();
    }
  }
}
