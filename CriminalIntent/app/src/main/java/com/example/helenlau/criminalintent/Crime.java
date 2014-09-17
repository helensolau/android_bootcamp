package com.example.helenlau.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by helenlau on 9/16/14.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

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
        return mDate;
    }

    public void setmDate(Date mDate) {
        mDate = mDate;
    }

    public boolean ismSolved() {
        return mSolved;
    }

    public void setmSolved(boolean mSolved) {
        mSolved = mSolved;
    }

    public Crime() {
        //Generate unique identifier
        mId = UUID.randomUUID();
        mDate = new Date();
    }
}
