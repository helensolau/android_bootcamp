package com.example.helenlau.criminalintent;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;
import java.util.UUID;

/**
 * Created by helenlau on 9/16/14.
 */
public class Crime {
    private static final String JSON_ID = "id";
    private static final String JSON_TITLE = "title";
    private static final String JSON_SOLVED = "solved";
    private static final String JSON_DATE = "date";

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

    public Crime(JSONObject json) throws JSONException {
        mId = UUID.fromString(json.getString(JSON_ID));
        if (json.has(JSON_TITLE)) {
            mTitle = json.getString(JSON_TITLE);
        }
        _mSolved = json.getBoolean(JSON_SOLVED);
        _mDate = new Date(json.getLong(JSON_DATE));
    }

    @Override
    public String toString() {
        return mTitle;
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_ID, mId.toString());
        json.put(JSON_TITLE, mTitle);
        json.put(JSON_SOLVED, _mSolved);
        json.put(JSON_DATE, _mDate.getTime());
        return json;
    }
}
