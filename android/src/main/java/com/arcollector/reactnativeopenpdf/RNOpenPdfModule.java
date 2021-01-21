package com.arcollector.reactnativeopenpdf;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;

public class RNOpenPdfModule extends ReactContextBaseJavaModule {
  private static final String CHOOSER_TITLE = "chooserTitle";

  public RNOpenPdfModule(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  /*
  * copy from https://stackoverflow.com/a/34431490/2321651
  */
  @ReactMethod
  public void open(String path, ReadableMap options) {
    Intent browserIntent = new Intent(Intent.ACTION_VIEW);
    browserIntent.setDataAndType(Uri.parse(path), "application/pdf");

    Intent chooser = Intent.createChooser(
      browserIntent,
      options.hasKey(CHOOSER_TITLE) ? options.getString(CHOOSER_TITLE) : "Open with"
    );
    chooser.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

    Activity activity = getCurrentActivity();
    if (activity != null) {
      activity.startActivity(chooser);
    }
  }

  @Override
  public String getName() {
    return "RNOpenPdf";
  }

}
