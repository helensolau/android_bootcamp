package com.example.helenlau.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by helenlau on 9/16/14.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date _mDate;
    private boolean _mSolved;

    public UUID getmId() {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getmDate() {
        return _mDate;
    }

    public void setmDate(Date mDate) {
        _mDate = mDate;
    }

    public boolean ismSolved() {
        return _mSolved;
    }

    public void setmSolved(boolean mSolved) {
        _mSolved = mSolved;
    }

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
        _mDate = new Date();
    }

    @Override
    public String toString() {
        return mTitle;
    }
}
