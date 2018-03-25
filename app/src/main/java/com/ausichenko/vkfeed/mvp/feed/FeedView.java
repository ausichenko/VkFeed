package com.ausichenko.vkfeed.mvp.feed;

import com.arellomobile.mvp.MvpView;

public interface FeedView extends MvpView {
    void showData(/* data */);
    void showProgress();
    void hideProgress();
    void showEmpty();
    void showError(String error);
}
