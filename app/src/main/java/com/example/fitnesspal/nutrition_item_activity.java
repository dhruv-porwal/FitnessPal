package com.example.fitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.TextView;

public class nutrition_item_activity extends AppCompatActivity {
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition_item);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));

        textView=findViewById(R.id.txt);
        String dstory=getIntent().getStringExtra("dstory");
        textView.setText(dstory);

    }
}