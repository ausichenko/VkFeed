package com.ausichenko.vkfeed;

import android.app.Application;

import com.vk.sdk.VKSdk;

public class VkFeedApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        VKSdk.initialize(getApplicationContext());
    }
}
