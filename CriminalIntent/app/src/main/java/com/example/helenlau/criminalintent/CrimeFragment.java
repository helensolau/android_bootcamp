package com.example.helenlau.criminalintent;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

/**
 * Created by helenlau on 9/16/14.
 */
public class CrimeFragment extends Fragment {
    private Crime mCrime;
    private EditText mTitleField;
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    //public static final String TAG = "com.example.helenlau.criminalintent.CrimeFragment";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parent, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime, parent, false);

        mTitleField = (EditText)v.findViewById(R.id.crime_title);
        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence c, int i, int i2, int i3) {
                //
            }

            @Override
            public void onTextChanged(CharSequence c, int i, int i2, int i3) {
                mCrime.setmTitle(c.toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {
                //
            }
        });

        mDateButton = (Button)v.findViewById(R.id.crime_date);
        //Log.d(TAG, mCrime.getmDate().toString());
        mDateButton.setText(android.text.format.DateFormat.format("EEEEEEEEE, MMM d, yyyy", mCrime.getmDate()).toString());
        mDateButton.setEnabled(false);

        mSolvedCheckBox = (CheckBox)v.findViewById(R.id.crime_solved);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                //set the crime's solved property
                mCrime.setmSolved(isChecked);
            }
        });

        return v;
    }
}
