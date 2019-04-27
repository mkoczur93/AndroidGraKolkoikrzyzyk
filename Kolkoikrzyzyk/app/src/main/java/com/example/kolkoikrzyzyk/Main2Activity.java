package com.example.kolkoikrzyzyk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

int licznik=0;

Button button2;
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

        button2 = (Button) findViewById (R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (Main2Activity.this, Main2Activity.class);
                startActivity(intent);


            }
        });


        imageView1 = (ImageView) findViewById (R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(licznik % 2 == 0) {
                    imageView1.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView1.setClickable(false);
                }
                else
                {
                    imageView1.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView1.setClickable(false);
                }

            }
        });
        imageView2 = (ImageView) findViewById (R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licznik % 2 == 0) {
                    imageView2.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView2.setClickable(false);
                }
                else
                {
                    imageView2.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView2.setClickable(false);
                }

            }
        });

        imageView3 = (ImageView) findViewById (R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licznik % 2 == 0) {
                    imageView3.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView3.setClickable(false);
                }
                else
                {
                    imageView3.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView3.setClickable(false);
                }

            }
        });

        imageView4 = (ImageView) findViewById (R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licznik % 2 == 0) {
                    imageView4.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView4.setClickable(false);
                }
                else
                {
                    imageView4.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView4.setClickable(false);
                }

            }
        });

        imageView5 = (ImageView) findViewById (R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licznik % 2 == 0) {
                    imageView5.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView5.setClickable(false);
                }
                else
                {
                    imageView5.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView5.setClickable(false);
                }

            }
        });

        imageView6 = (ImageView) findViewById (R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licznik % 2 == 0) {
                    imageView6.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView6.setClickable(false);
                }
                else
                {
                    imageView6.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView6.setClickable(false);
                }

            }
        });

        imageView7 = (ImageView) findViewById (R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licznik % 2 == 0) {
                    imageView7.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView7.setClickable(false);
                }
                else
                {
                    imageView7.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView7.setClickable(false);
                }

            }
        });

        imageView8 = (ImageView) findViewById (R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licznik % 2 == 0) {
                    imageView8.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView8.setClickable(false);
                }
                else
                {
                    imageView8.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView8.setClickable(false);
                }

            }
        });

        imageView9 = (ImageView) findViewById (R.id.imageView9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(licznik % 2 == 0) {
                    imageView9.setBackgroundResource(R.drawable.obrazek1);
                    licznik++;
                    imageView9.setClickable(false);
                }
                else
                {
                    imageView9.setBackgroundResource(R.drawable.obrazek2);
                    licznik++;
                    imageView9.setClickable(false);
                }

            }
        });
    }
}
