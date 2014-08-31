package com.example;

import android.app.Application;
import dagger.ObjectGraph;

import java.util.Arrays;
import java.util.List;

public class AndroidLunchApplication extends Application {
private ObjectGraph objectGraph;

  @Override
  public void onCreate() {
    super.onCreate();
    objectGraph = ObjectGraph.create(getModules().toArray());
  }

  public void inject(Object object) {
    objectGraph.inject(object);
  }

  protected List<Object> getModules() {
    return Arrays.asList(
        new AndroidModule(this),
        new AndroidLunchModule()
    );
  }
}
