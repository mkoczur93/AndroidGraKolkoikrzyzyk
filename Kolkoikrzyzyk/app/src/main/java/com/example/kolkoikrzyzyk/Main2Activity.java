package com.example.kolkoikrzyzyk;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.TimerTask;

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
int image1 = 0;
int image2 = 0;
int image3 = 0;
int image4 = 0;
int image5 = 0;
int image6 = 0;
int image7 = 0;
int image8 = 0;
int image9 = 0;
TextView text;
TextView text1;
String name3;
String name4;
TextView gracz;
TextView timer;
Thread pierwszy;
int koniec = 0;
int liczba = 10;
int czas = 10;
int stop = 0;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().hide();

        String name1 = getIntent().getStringExtra("name1");
        name3 = name1;
        String name2 = getIntent().getStringExtra("name2");
        name4 = name2;


        button2 = (Button) findViewById (R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent (Main2Activity.this, Main2Activity.class);
                intent.putExtra("name1", name3);
                intent.putExtra("name2", name4);
                finish();
                startActivity(intent);


            }
        });


        imageView1 = (ImageView) findViewById (R.id.imageView1);
        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image1 = zmienwartosc(image1);
                image(imageView1);
                stop = 1;
                koniec();
                thread1();



            }

        });


        imageView2 = (ImageView) findViewById (R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                image2 = zmienwartosc(image2);
                image(imageView2);
                stop = 1;
                koniec();
                thread1();


            }
        });

        imageView3 = (ImageView) findViewById (R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image3 = zmienwartosc(image3);
                image(imageView3);
                stop = 1;
                koniec();
                thread1();


            }
        });

        imageView4 = (ImageView) findViewById (R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image4 = zmienwartosc(image4);
                image(imageView4);
                stop = 1;
                koniec();
                thread1();


            }
        });

        imageView5 = (ImageView) findViewById (R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image5 = zmienwartosc(image5);
                image(imageView5);
                stop = 1;
                koniec();
                thread1();


            }
        });

        imageView6 = (ImageView) findViewById (R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image6 = zmienwartosc(image6);
                image(imageView6);
                stop = 1;
                koniec();
                thread1();


            }
        });

        imageView7 = (ImageView) findViewById (R.id.imageView7);
        imageView7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image7 = zmienwartosc(image7);
                image(imageView7);
                stop = 1;
                koniec();
                thread1();


            }
        });

        imageView8 = (ImageView) findViewById (R.id.imageView8);
        imageView8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image8 = zmienwartosc(image8);
                image(imageView8);
                stop = 1;
                koniec();
                thread1();


            }
        });

        imageView9 = (ImageView) findViewById (R.id.imageView9);
        imageView9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                image9 = zmienwartosc(image9);
                image(imageView9);
                stop = 1;
                koniec();
                thread1();


            }
        });

        text = (TextView) findViewById (R.id.text);
        text1 = (TextView) findViewById (R.id.text1);
        gracz = (TextView) findViewById (R.id.gracz);
        timer = (TextView) findViewById (R.id.timer);
        gracz.setText(name3);
        thread1();
    }///

   void image(ImageView wartosc)
    {
        if(licznik % 2 == 0) {
            wartosc.setBackgroundResource(R.drawable.obrazek1);
            wartosc.setClickable(false);
            licznik++;
            wynik();
            gracz.setText(name4);




        }
        else
        {
            wartosc.setBackgroundResource(R.drawable.obrazek2);
            wartosc.setClickable(false);
            licznik++;
            wynik();
            gracz.setText(name3);
        }





    };

   int zmienwartosc(int wartosc1)
    {
        if(licznik % 2 == 0) {

            wartosc1 = 1;

        }
        else
        {

            wartosc1  = 2;

        }

        return wartosc1;

    };

    void wynik()
    {
        if(image1 == 1 && image1  == image2 && image1 == image3 ||
                image4 == 1 && image4  == image5 && image4 == image6 ||
                image7 == 1 && image7  == image8 && image7 == image9 ||
                image1 == 1 && image1 == image4 && image1 == image7 ||
                image2 == 1 && image2 == image5 && image2 == image8 ||
                image3 == 1 && image3 == image6 && image3 == image9 ||
                image1 == 1 && image1 == image5 && image1 == image9 ||
                image3 == 1 && image3 == image5 && image3 == image7)

        {
           Click();
            text.setText("Wygral:");
            text1.setText(name3);
            koniec = 1;



        }

        else  if(image1 == 2 && image1  == image2 && image1 == image3 ||
                image4 == 2 && image4  == image5 && image4 == image6 ||
                image7 == 2 && image7  == image8 && image7 == image9 ||
                image1 == 2 && image1 == image4 && image1 == image7 ||
                image2 == 2 && image2 == image5 && image2 == image8 ||
                image3 == 2 && image3 == image6 && image3 == image9 ||
                image1 == 2 && image1 == image5 && image1 == image9 ||
                image3 == 2 && image3 == image5 && image3 == image7)

        {
            Click();
            text.setText("Wygral:");
            text1.setText(name4);
            koniec = 1;


        }

        else if(imageView1.isClickable() == false && imageView2.isClickable() == false && imageView3.isClickable() == false &&
                imageView4.isClickable() == false && imageView5.isClickable() == false && imageView6.isClickable() == false &&
                imageView7.isClickable() == false && imageView8.isClickable() == false && imageView9.isClickable() == false)
        {

            text.setText("Remis ! :)");
            koniec = 1;

        }
    };

    void Click()
    {
        imageView1.setClickable(false);
        imageView2.setClickable(false);
        imageView3.setClickable(false);
        imageView4.setClickable(false);
        imageView5.setClickable(false);
        imageView6.setClickable(false);
        imageView7.setClickable(false);
        imageView8.setClickable(false);
        imageView9.setClickable(false);
    };

    void koniec()
    {
        if(koniec==0)
        {
            liczba = czas;
            timer.setText((liczba)+"s");
        }

        else
        {
            if(licznik % 2 == 0)
                gracz.setText(name4);
            else
                gracz.setText(name3);

        }
    };

    void thread1() {
        Thread pierwszy = new Thread() {
            @Override
            public void run() {
                while (stop == 0 && liczba >= 2 && koniec == 0){
                    try {

                        Thread.sleep(1000);

                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                liczba--;
                                timer.setText(String.valueOf(liczba + "s"));
                            }
                        });

                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (stop == 1)
                stop = 0;
                else if (koniec == 1)
                {

                }
                else{
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            licznik++;
                            liczba = czas;;
                            timer.setText(String.valueOf(liczba + "s"));
                            if(gracz.getText() == name4)
                            {
                                gracz.setText(name3);
                                thread1();
                            }
                            else
                            {
                                gracz.setText(name4);
                                thread1();
                            }
                        }
                    });
                }



            }
        };

        pierwszy.start();
    }




}


