package com.example.vick.mtaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Homes extends AppCompatActivity {
    private ImageView imghotelhome,imgurban;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homes);
        imghotelhome = findViewById(R.id.imghotelhome);
        imgurban = findViewById(R.id.imgurban);
    }
}
