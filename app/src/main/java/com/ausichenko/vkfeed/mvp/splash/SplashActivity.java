package com.ausichenko.vkfeed.mvp.splash;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

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
        // TODO: 19.03.18 LOGIN
    }

    @Override
    public void startFeedActivity() {
        // TODO: 19.03.18 FEED
    }
}
