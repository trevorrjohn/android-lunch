package com.example;

import android.app.Application;
import com.example.module.ApiClientModule;
import dagger.ObjectGraph;

import java.util.ArrayList;
import java.util.List;

public class AndroidLunchApplication extends Application {
  private ObjectGraph objectGraph;

  @Override
  public void onCreate() {
    super.onCreate();
    objectGraph = ObjectGraph.create(getModules().toArray());
  }

  public <T> T inject(T object) {
    return objectGraph.inject(object);
  }

  protected List<Object> getModules() {
    ArrayList<Object> modules = new ArrayList<Object>();

    modules.add(new AndroidModule(this));
    modules.add(new AndroidLunchModule());
    modules.add(new ApiClientModule());

    return modules;
  }
}
