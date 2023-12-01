package com.example.uibasics2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this );
    }

    @Override
    public void onClick(View v) {
        switch(v.getid()){
            case R.id.btnHello:
                System.out.println("Hello");
                break;
            default:
                break;
        }
    }
}