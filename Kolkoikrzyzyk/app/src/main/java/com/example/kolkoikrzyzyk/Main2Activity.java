package com.example.kolkoikrzyzyk;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {


ImageView imageView1;
ImageView imageView2;
ImageView imageView3;
ImageView imageView4;
ImageView imageView5;
ImageView imageView6;
ImageView imageView7;
ImageView imageView8;
ImageView imageView9;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();
        imageView1 = (ImageView) findViewById (R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imageView1.setBackgroundResource(R.drawable.obrazek1);
            }
        });
    }
}
