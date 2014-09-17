package com.example.helenlau.criminalintent;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by helenlau on 9/16/14.
 */
public abstract class SingleFragmentActivity extends FragmentActivity {
    protected abstract Fragment createFragment();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);
        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.frangmentContainer);

        if (fragment == null) {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.frangmentContainer, fragment).commit();
        }
    }

}
