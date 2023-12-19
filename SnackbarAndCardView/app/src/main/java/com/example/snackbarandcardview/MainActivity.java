package com.example.snackbarandcardview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private Button btnSnackBar;
    private RelativeLayout RLlayout;
    private MaterialCardView mcw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSnackBar =findViewById(R.id.btSnackBar);
        RLlayout = findViewById(R.id.RLlayout);

        mcw=findViewById(R.id.mcw);
        mcw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Card clicked", Toast.LENGTH_SHORT).show();
            }
        });
        btnSnackBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showSnackBar();
            }
        });


    }
    private void showSnackBar() {
        Snackbar.make(RLlayout, "this is Snackbar", Snackbar.LENGTH_INDEFINITE)
                .setAction("Retry", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "retry clicked", Toast.LENGTH_SHORT).show();
                    }
                })
                .setActionTextColor(Color.RED)
                .setTextColor(Color.YELLOW)
                .show();
    }
}