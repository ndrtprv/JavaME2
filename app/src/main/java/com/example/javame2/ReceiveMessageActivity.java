package com.example.javame2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    final String TAG = "States";
    String text = "";
    final static String TEXT_VARIABLE_KEY = "TEXT_VARIABLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_msg);
        if (savedInstanceState != null) {
            text = savedInstanceState.getString(TEXT_VARIABLE_KEY);
        }
        Intent intent = getIntent();
        String msgText = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView msgView = findViewById(R.id.textView);
        msgView.setText(msgText);
    }

    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i(TAG, "ReceiveMessageActivity: onSaveInstanceState()");
        outState.putString(TEXT_VARIABLE_KEY, findViewById(R.id.textView).toString());
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "ReceiveMessageActivity: onRestart()");
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "ReceiveMessageActivity: onStart()");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "ReceiveMessageActivity: onStop()");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "ReceiveMessageActivity: onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "ReceiveMessageActivity: onPause()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "ReceiveMessageActivity: onDestroy()");
    }
}