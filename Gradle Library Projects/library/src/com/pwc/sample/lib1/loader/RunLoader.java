package com.pwc.sample.lib1.loader;

import com.pwc.sample.lib1.dao.RunManager;
import com.pwc.sample.loader.DataLoader;
import com.pwc.sample.model.Run;

import android.content.Context;

public class RunLoader extends DataLoader<Run> {
    private long mRunId;
    
    public RunLoader(Context context, long runId) {
        super(context);
        mRunId = runId;
    }
    
    @Override
    public Run loadInBackground() {
        return RunManager.get(getContext()).getRun(mRunId);
    }
}