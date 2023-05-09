package com.example.fitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {
    Animation up,down;

    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.back)));
        imageView=findViewById(R.id.app_splash);
        textView=findViewById(R.id.app_name);
up= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
    imageView.setAnimation(up);


        down= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        textView.setAnimation(down);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
startActivity(new Intent(SplashScreen.this,MainActivity.class));
finish();
            }
        },3500);

    }
}