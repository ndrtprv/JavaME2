package com.example.javame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_msg);
    }

    public void onSendMessage(View view) {
        EditText messageView = findViewById(R.id.editText);

        String messageText = messageView.getText().toString();

        if (!messageText.isBlank()) {
            Intent intent = new Intent(this, ReceiveMessageActivity.class);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, messageText);

            startActivity(intent);
        }
    }

    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "CreateMessageActivity: onRestart()");
    }

    protected void onStart() {
        super.onStart();
        Log.i(TAG, "CreateMessageActivity: onStart()");
    }

    protected void onStop() {
        super.onStop();
        Log.i(TAG, "CreateMessageActivity: onStop()");
    }

    protected void onResume() {
        super.onResume();
        Log.i(TAG, "CreateMessageActivity: onResume()");
    }

    protected void onPause() {
        super.onPause();
        Log.i(TAG, "CreateMessageActivity: onPause()");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "CreateMessageActivity: onDestroy()");
    }
}