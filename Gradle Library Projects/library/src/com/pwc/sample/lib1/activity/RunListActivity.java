package com.pwc.sample.lib1.activity;

import com.pwc.sample.activity.SingleFragmentActivity;
import com.pwc.sample.lib1.activity.fragment.RunListFragment;

import android.support.v4.app.Fragment;

public class RunListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }

}
