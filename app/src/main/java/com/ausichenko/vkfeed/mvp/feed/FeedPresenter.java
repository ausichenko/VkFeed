package com.ausichenko.vkfeed.mvp.feed;

import android.util.Log;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.ausichenko.vkfeed.data.api.methods.VKApiNewsfeed;
import com.vk.sdk.api.VKApi;
import com.vk.sdk.api.VKError;
import com.vk.sdk.api.VKParameters;
import com.vk.sdk.api.VKRequest;
import com.vk.sdk.api.VKResponse;

@InjectViewState
public class FeedPresenter extends MvpPresenter<FeedView> {

    void loadFeed() {
        VKApiNewsfeed apiNewsfeed = new VKApiNewsfeed();
        VKParameters parameters = new VKParameters();
        VKRequest request = apiNewsfeed.get(parameters);
        request.executeWithListener(new VKRequest.VKRequestListener() {
            @Override
            public void onComplete(VKResponse response) {
                Log.d("FeedPresenter", "onComplete()");
            }

            @Override
            public void onError(VKError error) {
                Log.d("FeedPresenter", "onError()");
            }

            @Override
            public void onProgress(VKRequest.VKProgressType progressType, long bytesLoaded, long bytesTotal) {
                Log.d("FeedPresenter", "onProgress()");
            }
        });
    }
}
