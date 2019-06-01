package com.example.kolkoikrzyzyk;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;

import java.security.PrivateKey;

public class Start extends AppCompatActivity {


    ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.logostart);
        getSupportActionBar().hide();
        logo = (ImageView) findViewById(R.id.logostart);
        startAnim();


    }

    private void startAnim()
    {
        Animation out = new AlphaAnimation(0f,1f);
        out.setDuration(3500);

        out.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                Intent intent = new Intent (Start.this, MainActivity.class);
                startActivity(intent);
                finish();

            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        logo.startAnimation(out);


    }
}
