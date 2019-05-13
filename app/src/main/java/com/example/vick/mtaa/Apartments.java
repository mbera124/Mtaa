package com.example.vick.mtaa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Apartments extends AppCompatActivity{
    private ImageView imgbrandon,imgluke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apartments);
        imgbrandon = findViewById(R.id.imgbrandon);
         imgluke = findViewById(R.id.imgluke);

    }
}
