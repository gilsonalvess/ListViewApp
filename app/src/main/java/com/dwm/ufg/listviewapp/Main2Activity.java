package com.dwm.ufg.listviewapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView textViewNomeTime = (TextView) findViewById(R.id.nomeTime);
        ImageView imgViewTime = (ImageView) findViewById(R.id.imgTime);

        Time time = (Time) getIntent().getSerializableExtra("time");

        textViewNomeTime.setText(time.getNome());
        imgViewTime.setImageResource(time.getBrasao());
    }
}
