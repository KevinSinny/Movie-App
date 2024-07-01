package com.example.movieapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6,e7,e8,e9,e10;
    AppCompatButton b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText) findViewById(R.id.movieid);
        e2=(EditText) findViewById(R.id.actorid);
        e3=(EditText) findViewById(R.id.actressid);
        e4=(EditText) findViewById(R.id.relid);
        e5=(EditText) findViewById(R.id.langid);
        e6=(EditText) findViewById(R.id.Grossid);
        e7=(EditText) findViewById(R.id.distid);
        e8=(EditText) findViewById(R.id.prodid);
        e8=(EditText) findViewById(R.id.prodcoid);
        b1=(AppCompatButton) findViewById(R.id.subbtn);
        b2=(AppCompatButton) findViewById(R.id.Viewbtn);

    }
}