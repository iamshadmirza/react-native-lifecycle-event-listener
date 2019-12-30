package com.reactlibraryeventlistener;

import android.widget.Toast;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.bridge.ReactMethod;

public class LifecycleEventListenerModule extends ReactContextBaseJavaModule implements LifecycleEventListener {

    private final ReactApplicationContext reactContext;

    public LifecycleEventListenerModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
        reactContext.addLifecycleEventListener(this);
    }

    @Override
    public String getName() {
        return "LifecycleEventListener";
    }

    @ReactMethod
    public void showAlertToast(String text) {
        Toast.makeText(reactContext, text, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onHostResume() {
        reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("onResume",
                null);
    }

    @Override
    public void onHostPause() {
        reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("onPause",
                null);
    }

    @Override
    public void onHostDestroy() {
        reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class).emit("onDestroy",
                null);
    }
}
