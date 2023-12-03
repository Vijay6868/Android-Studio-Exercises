package com.example.uibasic3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ProgressBar;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
     private CheckBox checkboxHarry, checkboxMatrix, checkboxJoker;
     private RadioGroup rgMartialStatus;
     private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkboxHarry = findViewById(R.id.checkboxHarry);
        checkboxMatrix = findViewById(R.id.checkboxMatrix);
        checkboxJoker = findViewById(R.id.checkboxJoker);
        rgMartialStatus = findViewById(R.id.RgMartialStatus);
        progressBar = findViewById(R.id.progressBar);
        rgMartialStatus.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if(checkedId==R.id.rbMarried){
                    Toast.makeText(MainActivity.this, "you are married", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.VISIBLE);
                } else if (checkedId==R.id.rbInRelationship) {
                    Toast.makeText(MainActivity.this, "you are in relationship", Toast.LENGTH_SHORT).show();
                    progressBar.setVisibility(View.GONE);
                } else if (checkedId==R.id.rbSingle) {
                    Toast.makeText(MainActivity.this, "you are single", Toast.LENGTH_SHORT).show();
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