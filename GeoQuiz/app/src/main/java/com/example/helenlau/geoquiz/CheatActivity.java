package com.example.helenlau.geoquiz;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by helenlau on 9/15/14.
 */
public class CheatActivity extends ActionBarActivity {
    public static final String EXTRA_ANSWER_IS_TRUE = "com.example.helenlau.geoquiz.answer_is_true";
    public static final String EXTRA_ANSWER_SHOWN = "com.example.helenlau.geoquiz.answer_shown";
    private static final String TAG = "CheatActivity";
    private static final String KEY_INDEX = "cheat";

    private boolean mAnswerIsTrue;

    private TextView mAnswerTextView;
    private Button mShowAnswer;

    private void showAnswer() {
        Log.d(TAG, "showAnswer, isCheater=" + mAnswerIsTrue, new Exception());
        if (mAnswerIsTrue) {
            mAnswerTextView.setText(R.string.true_button);
        } else {
            mAnswerTextView.setText(R.string.false_button);
        }
    }

    private void setAnswerShownResult(boolean isAnswerShown) {
        Log.d(TAG, "setAnswerShownResult, isCheater=" + isAnswerShown, new Exception());

        Intent data = new Intent();
        data.putExtra(EXTRA_ANSWER_SHOWN, isAnswerShown);
        setResult(RESULT_OK, data);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cheat);

        mAnswerIsTrue = getIntent().getBooleanExtra(EXTRA_ANSWER_IS_TRUE, false);
        mAnswerTextView = (TextView)findViewById(R.id.answerTextView);

        // Answer will not be shown until the user presses the button
        setAnswerShownResult(false);

        mShowAnswer = (Button)findViewById(R.id.showAnswerButton);
        mShowAnswer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onCreate, isCheater="+ mAnswerIsTrue, new Exception());
                showAnswer();
                setAnswerShownResult(true);
            }
        });

        if (savedInstanceState != null) {
            mAnswerIsTrue = savedInstanceState.getBoolean(KEY_INDEX, false);
            showAnswer();
        }

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        Log.d(TAG, "onSaveInstanceState, isCheater="+ mAnswerIsTrue, new Exception());
        savedInstanceState.putBoolean(KEY_INDEX, mAnswerIsTrue);
    }


}
