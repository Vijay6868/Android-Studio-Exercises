package com.example.uibasic3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private CheckBox checkboxHarry, checkboxMatrix, checkboxJoker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxHarry = findViewById(R.id.checkboxHarry);
        checkboxMatrix = findViewById(R.id.checkboxMatrix);
        checkboxJoker = findViewById(R.id.checkboxJoker);

        checkboxHarry.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText(MainActivity.this, "you watched harry potter", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "you need to watch Harry potter", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}