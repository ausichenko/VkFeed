package com.ausichenko.vkfeed.mvp.splash;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

@InjectViewState
public class SplashPresenter extends MvpPresenter<SplashView> {

    void perform() {
        // TODO: 19.03.18 check login state
        boolean isLogin = true;

        if (isLogin) {
            getViewState().startFeedActivity();
        } else {
            getViewState().startLoginActivity();
        }
    }
}
