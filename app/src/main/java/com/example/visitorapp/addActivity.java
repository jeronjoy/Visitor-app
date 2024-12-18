package com.example.visitorapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class addActivity extends AppCompatActivity {
EditText e1,e2,e3,e4;
Button b1,b2;
String st1,st2,st3,st4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add);
        e1=(EditText) findViewById(R.id.fname);
        e2=(EditText) findViewById(R.id.lname);
        e3=(EditText) findViewById(R.id.purpose);
        e4=(EditText) findViewById(R.id.meet);
        b1=(Button) findViewById(R.id.add);
        b2=(Button) findViewById(R.id.menu);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            };


        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                st1=e1.getText().toString();
                st2=e2.getText().toString();
                st3=e3.getText().toString();
                st4=e4.getText().toString();
                Toast.makeText(getApplicationContext(),st1,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),st2,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),st3,Toast.LENGTH_LONG).show();
                Toast.makeText(getApplicationContext(),st4,Toast.LENGTH_LONG).show();
            }
        });

    }
}