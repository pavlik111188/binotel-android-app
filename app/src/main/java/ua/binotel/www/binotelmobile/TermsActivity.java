package ua.binotel.www.binotelmobile;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.io.IOException;

import static android.content.ContentValues.TAG;

public class TermsActivity extends Activity {

    public TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.terms_layout);
        Log.v(TAG, "test");
        mTextView = (TextView) findViewById(R.id.txtTerms2);


        try {
            mTextView.setText(MainActivity.getDataFromRawFiles(R.raw.terms));
        } catch (IOException e) {

        }
    }

}