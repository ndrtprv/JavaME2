package com.example.javame2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CreateMessageActivity extends AppCompatActivity {

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
}