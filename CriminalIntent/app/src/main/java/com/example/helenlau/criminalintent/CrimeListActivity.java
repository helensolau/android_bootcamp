package com.example.helenlau.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

/**
 * Created by helenlau on 9/16/14.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected  Fragment createFragment() {
        return new CrimeListFragment();
    }
}
