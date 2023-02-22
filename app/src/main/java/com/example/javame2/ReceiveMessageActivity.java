package com.example.javame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ReceiveMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_msg);
        Intent intent = getIntent();
        String msgText = intent.getStringExtra(Intent.EXTRA_TEXT);
        TextView msgView = findViewById(R.id.textView);
        msgView.setText(msgText);
    }
}