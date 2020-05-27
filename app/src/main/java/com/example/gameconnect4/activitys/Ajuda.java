package com.example.gameconnect4.activitys;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;

import androidx.appcompat.app.AppCompatActivity;

import com.example.gameconnect4.R;

public class Ajuda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajuda);

        Button btnTornar = (Button) findViewById(R.id.tornar);
        btnTornar.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Ajuda.this, MainActivity.class));
                finish();
            }
        });
    }
}