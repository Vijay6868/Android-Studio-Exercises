package com.example.registration_form;

import androidx.appcompat.app.AppCompatActivity;

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
    public void onBtnRegisterClick(View view){
        EditText firstName = findViewById(R.id.tfFirstName);
        EditText lastName = findViewById(R.id.tfLastName);
        EditText email = findViewById(R.id.tfEmail);

        TextView tvFirstName = findViewById(R.id.tvFirstName);
        TextView tvLastName = findViewById(R.id.tvLastName);
        TextView tvEmail = findViewById(R.id.tvEmail);

        tvFirstName.setText(firstName.getText().toString());
        tvLastName.setText(lastName.getText().toString());
        tvEmail.setText(email.getText().toString());
    }
}