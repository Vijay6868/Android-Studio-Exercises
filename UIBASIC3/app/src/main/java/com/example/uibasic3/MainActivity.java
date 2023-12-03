package com.example.uibasic3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private CheckBox checkboxHarry, checkboxMatrix, checkboxJoker;
     private RadioGroup rgMartialStatus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxHarry = findViewById(R.id.checkboxHarry);
        checkboxMatrix = findViewById(R.id.checkboxMatrix);
        checkboxJoker = findViewById(R.id.checkboxJoker);
        rgMartialStatus = findViewById(R.id.RgMartialStatus);
        rgMartialStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rbMarried){
                    Toast.makeText(MainActivity.this, "you are married", Toast.LENGTH_SHORT).show();
                }
            }
        });

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