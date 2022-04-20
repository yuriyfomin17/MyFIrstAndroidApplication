package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setupUI();
    }

    private void setupUI(){
        setContentView(R.layout.activity_main);
        mTextView = (TextView) findViewById(R.id.textView);
    }


    private final static String LOG_TAG = MainActivity.class.getSimpleName();

    public void buttonPressed(View view){
        Log.i(LOG_TAG, "buttonPressed(View) Called");

        String stringValue = "Hello World";

        mTextView.setText(stringValue);

        Log.v(LOG_TAG, " text changed to:" + stringValue);

        Log.d(LOG_TAG, "buttonPressed(View) finished");


    }
}