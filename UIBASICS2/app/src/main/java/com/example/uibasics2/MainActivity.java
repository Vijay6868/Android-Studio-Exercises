package com.example.uibasics2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText txtName;
    private TextView txtHello;

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.edTxtName) {


            Toast.makeText(this, "trying to edit", Toast.LENGTH_SHORT).show();
        }
        else if (v.getId()==R.id.btnHello) {
            txtHello.setText("Hello "  + txtName.getText().toString());
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnHello = findViewById(R.id.btnHello);
        btnHello.setOnClickListener(this);

        btnHello.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(MainActivity.this, "Long press", Toast.LENGTH_SHORT).show();
                return true;
            }
        });
        txtName = findViewById(R.id.edTxtName);
        txtHello = findViewById(R.id.txtHello);

    }


}