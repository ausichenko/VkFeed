package com.ausichenko.vkfeed.mvp.feed;

import android.os.Bundle;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.ausichenko.vkfeed.R;

public class FeedActivity extends MvpAppCompatActivity implements FeedView {

    @InjectPresenter
    FeedPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
    }
}
