package com.oka.demo.morningtimekeeper.dialog;

import android.app.Activity;
import android.os.Bundle;

import com.oka.demo.morningtimekeeper.util.MyApp;
import com.oka.demo.morningtimekeeper.util.MyLog;

/**
 * 通知画面のActivity.
 * {@link TimeKeeperDialogFragment}を開くためのActivity.
 */
public class TimeKeeperActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        MyLog.d();
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        super.onStart();
        TimeKeeperDialogFragment timeKeeperDialogFragment = new TimeKeeperDialogFragment();
        timeKeeperDialogFragment.show(getFragmentManager(), MyApp.getTag(this));
    }

    @Override
    protected void onStop() {
        finish();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        MyLog.d();
        super.onDestroy();
    }
}
