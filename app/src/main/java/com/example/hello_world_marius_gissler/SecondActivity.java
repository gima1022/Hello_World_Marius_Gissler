package com.example.hello_world_marius_gissler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        TextView lblMessage= this.findViewById(R.id.lblMessage);


        Intent intent =this.getIntent();
        if (intent != null) {
            String message = intent.getStringExtra("Message");
            lblMessage.setText(message);
        }
    }
}