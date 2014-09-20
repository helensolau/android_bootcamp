package com.example.helenlau.criminalintent;

import android.support.v4.app.FragmentTransaction;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

/**
 * Created by helenlau on 9/16/14.
 */
public class CrimeListActivity extends SingleFragmentActivity implements CrimeListFragment.Callbacks, CrimeFragment.Callbacks {

    @Override
    protected  Fragment createFragment() {
        return new CrimeListFragment();
    }

    @Override
    protected int getLayoutResId() {
        //always point to twopane
        //return R.layout.activity_twopane;
        return R.layout.activity_masterdetail;
    }

    public void onCrimeSelected(Crime crime) {
        if (findViewById(R.id.detailFrangmentContainer) == null) {
            //Start an instance of CrimePagerActivity
            Intent i = new Intent(this, CrimePagerActivity.class);
            i.putExtra(CrimeFragment.EXTRA_CRIME_ID, crime.getmId());
            startActivity(i);
        } else  {
            FragmentManager fm = getSupportFragmentManager();
            FragmentTransaction ft = fm.beginTransaction();

            Fragment oldDetail = fm.findFragmentById(R.id.detailFrangmentContainer);
            Fragment newDetail = CrimeFragment.newInstance(crime.getmId());

            if (oldDetail != null) {
                ft.remove(oldDetail);
            }

            ft.add(R.id.detailFrangmentContainer, newDetail);
            ft.commit();
        }
    }

    public void onCrimeUpdated(Crime crime) {
        FragmentManager fm = getSupportFragmentManager();
        CrimeListFragment listFragment = (CrimeListFragment)fm.findFragmentById(R.id.frangmentContainer);
        listFragment.updateUI();
    }
}

