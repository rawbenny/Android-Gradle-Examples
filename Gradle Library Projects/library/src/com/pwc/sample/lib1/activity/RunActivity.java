package com.pwc.sample.lib1.activity;

import android.os.Bundle;
import android.support.v4.app.Fragment;

import com.pwc.sample.activity.SingleFragmentActivity;
import com.pwc.sample.lib1.activity.fragment.RunFragment;

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
    }

}
