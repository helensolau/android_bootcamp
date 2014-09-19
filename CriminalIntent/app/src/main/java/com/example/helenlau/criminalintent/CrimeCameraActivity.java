package com.example.helenlau.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by helenlau on 9/18/14.
 */
public class CrimeCameraActivity extends SingleFragmentActivity {
    @Override
    protected Fragment createFragment() {
        return new CrimeCameraFragment();
    }
}
