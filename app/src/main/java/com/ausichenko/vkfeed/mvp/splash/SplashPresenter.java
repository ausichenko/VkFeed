package com.ausichenko.vkfeed.mvp.splash;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.vk.sdk.VKSdk;

@InjectViewState
public class SplashPresenter extends MvpPresenter<SplashView> {

    void perform() {
        if (VKSdk.isLoggedIn()) {
            getViewState().startFeedActivity();
        } else {
            getViewState().startLoginActivity();
        }
    }
}
