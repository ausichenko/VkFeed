package com.ausichenko.vkfeed.mvp.feed;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.ausichenko.vkfeed.R;
import com.vk.sdk.VKSdk;

public class FeedActivity extends MvpAppCompatActivity implements FeedView {

    public static Intent getIntent(Context context) {
        Intent intent = new Intent(context, FeedActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        return intent;
    }

    @InjectPresenter
    FeedPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_feed, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.logout:
                VKSdk.logout();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
