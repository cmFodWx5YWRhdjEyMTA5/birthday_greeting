package com.example.ankush.birthday_greeting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Greet(View view)
    {

        EditText name = (EditText) findViewById(R.id.name);
        String newName = name.getText().toString();

        setContentView(R.layout.layout2);
        TextView message= (TextView) findViewById(R.id.newMessage);
        message.setText("Happy Birthday "+newName);


    }

}
