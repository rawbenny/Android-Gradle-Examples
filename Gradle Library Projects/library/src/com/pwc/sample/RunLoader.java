package com.pwc.sample;

import android.content.Context;

class RunLoader extends DataLoader<Run> {
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