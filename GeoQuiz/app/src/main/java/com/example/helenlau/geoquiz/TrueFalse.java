package com.example.helenlau.geoquiz;

/**
 * Created by helenlau on 9/15/14.
 */
public class TrueFalse {
    private int mQuestion;
    private boolean mTrueQuestion;

    public void setmQuestion(int mQuestion) {
        this.mQuestion = mQuestion;
    }

    public void setmTrueQuestion(boolean mTrueQuestion) {
        this.mTrueQuestion = mTrueQuestion;
    }

    public int getmQuestion() {

        return mQuestion;
    }

    public boolean ismTrueQuestion() {
        return mTrueQuestion;
    }

    public TrueFalse(int question, boolean trueQuestion) {
        mQuestion = question;
        mTrueQuestion = trueQuestion;
    }
}
