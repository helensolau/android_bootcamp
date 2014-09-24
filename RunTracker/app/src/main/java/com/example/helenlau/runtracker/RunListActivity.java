package com.example.helenlau.runtracker;

import android.support.v4.app.Fragment;

/**
 * Created by helenlau on 9/24/14.
 */
public class RunListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new RunListFragment();
    }
}
