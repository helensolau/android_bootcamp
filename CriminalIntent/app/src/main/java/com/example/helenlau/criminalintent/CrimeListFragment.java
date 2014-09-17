package com.example.helenlau.criminalintent;

import android.support.v4.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by helenlau on 9/16/14.
 */
public class CrimeListFragment extends ListFragment {
    private ArrayList<Crime> mCrimes;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getActivity().setTitle(R.string.crimes_title);
        //get the CrimeLab singleton and list of crimes
        mCrimes = CrimeLab.get(getActivity()).getCrimes();

        ArrayAdapter<Crime> adapter = new ArrayAdapter<Crime>(getActivity(), android.R.layout.simple_list_item_1, mCrimes);
        setListAdapter(adapter);
    }
}
