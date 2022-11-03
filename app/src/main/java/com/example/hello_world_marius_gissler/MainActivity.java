package com.example.hello_world_marius_gissler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSendMessage = this.findViewById(R.id. btnSendMessage);
        Button btnopen2nd_activity=this.findViewById(R.id.btnopen2nd_activity);
        Button btnopen_departure_activity=this.findViewById(R.id.btnopen_departure_activity);

        EditText edtMessage=this.findViewById(R.id.edtMessage);
        TextView txtMessage= this.findViewById(R.id.txtMessage);
        EditText edtUrl = this.findViewById(R.id.edtUrl);



        btnSendMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = edtMessage.getText().toString();
                txtMessage.setText(message);


                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Message",message);

                startActivity(intent);

            }
        });

        btnopen2nd_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = edtUrl.getText().toString();
                txtMessage.setText(message);


                Intent intent= new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Message",message);

                startActivity(intent);

            }
        });

        btnopen_departure_activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String message = edtUrl.getText().toString();
                txtMessage.setText(message);


                Intent intent= new Intent(MainActivity.this, departure_activity.class);
                intent.putExtra("Message",message);

                startActivity(intent);

            }
        });
    }



    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this,"Hello World!", Toast.LENGTH_SHORT).show();

        Log.i("TAG", "Hello World!");
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.i("TAG", "Hello World!");

    }

    public void openUrl(View view){

        EditText txtUrl=this.findViewById(R.id.edtUrl);
        String url =txtUrl.getText().toString();

        Intent browserIntent =new Intent(Intent.ACTION_VIEW,Uri.parse(url));
        Intent browserChooser=Intent.createChooser((browserIntent),"Wähle einen Browser");
        this.startActivity(browserChooser);

    }
}