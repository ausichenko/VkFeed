package com.ausichenko.vkfeed.mvp.splash;

import android.content.Intent;
import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.ausichenko.vkfeed.mvp.feed.FeedActivity;
import com.vk.sdk.VKAccessToken;
import com.vk.sdk.VKCallback;
import com.vk.sdk.VKSdk;
import com.vk.sdk.api.VKError;

public class SplashActivity extends MvpAppCompatActivity implements SplashView {

    @InjectPresenter
    SplashPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mPresenter.perform();
    }

    @Override
    public void startLoginActivity() {
        VKSdk.login(this, "wall", "friends");
    }

    @Override
    public void startFeedActivity() {
        Intent intent = FeedActivity.getIntent(getApplicationContext());
        startActivity(intent);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (!VKSdk.onActivityResult(requestCode, resultCode, data, new VKCallback<VKAccessToken>() {
            @Override
            public void onResult(VKAccessToken res) {
                startFeedActivity();
            }
            @Override
            public void onError(VKError error) {
                // TODO: 19.03.18 ERROR
            }
        })) {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }
}
