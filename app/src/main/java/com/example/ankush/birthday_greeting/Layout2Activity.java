package com.example.ankush.birthday_greeting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Layout2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout2);
        Intent details = getIntent();
        String message = details.getStringExtra("key");
        TextView displayingMessage = (TextView) findViewById(R.id.newMessage);
        displayingMessage.setText(message);
    }
}
