package com.poly.madlibs;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MadLibUtil {

    public static void prepareStory(EditText[] etArray, Button btnNext) {
        btnNext.setEnabled(false);


        for (EditText et:etArray) {
            et.setOnFocusChangeListener(new View.OnFocusChangeListener() {
                @Override
                public void onFocusChange(View v, boolean hasFocus) {
                    if (!hasFocus) {
                        et.setText(et.getText().toString().trim());
                    }
                    if (allFilled(etArray)) {
                        btnNext.setEnabled(true);
                    }
                }
            });

            et.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    if (actionId == EditorInfo.IME_ACTION_DONE || actionId == EditorInfo.IME_ACTION_NEXT) {
                        et.setText(et.getText().toString().trim());
                        if (allFilled(etArray)) {
                            btnNext.setEnabled(true);
                        }
                    }
                    return false;
                }
            });
        }

    }

    private static boolean allFilled(EditText[] etAllEditTexts) {
        for (EditText et:etAllEditTexts) {
            if (TextUtils.isEmpty(et.getText().toString())) {
                return false;
            }
        }
        return true;
    }
}
