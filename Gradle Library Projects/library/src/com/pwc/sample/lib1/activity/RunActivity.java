package com.pwc.sample.lib1.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.pwc.sample.MyApplication;
import com.pwc.sample.RunFragment;
import com.pwc.sample.RunListFragment;
import com.pwc.sample.SingleFragmentActivity;

public class RunActivity extends SingleFragmentActivity {
    /** A key for passing a run ID as a long */
    public static final String EXTRA_RUN_ID = "RUN_ID";
    
    @Override
    protected Fragment createFragment() {
        long runId = getIntent().getLongExtra(EXTRA_RUN_ID, -1);
        if (runId != -1) {
            return RunFragment.newInstance(runId);
        } else {
            return new RunFragment();
        }
    }
    
    @Override 
    public void onCreate(Bundle savedInstanceState){
    	super.onCreate(savedInstanceState);
    	MyApplication myApplication = (MyApplication)this.getApplication();
    	myApplication.countForward();
    	Log.d("qqqq","..."+myApplication.getCounter());
    }

    public static class RunListActivity extends SingleFragmentActivity {

        @Override
        protected Fragment createFragment() {
            return new RunListFragment();
        }

    }
}
