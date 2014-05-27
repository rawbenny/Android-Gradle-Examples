package com.pwc.sample.lib1.activity;

import android.support.v4.app.Fragment;

import com.pwc.sample.activity.SingleFragmentActivity;
import com.pwc.sample.lib1.activity.fragment.RunListFragment;

/**
 * Created by ryan on 5/27/14.
 */
public class ListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }

}