package com.example.fitnesspal;

import androidx.appcompat.app.AppCompatActivity;


import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class bmi_activity extends AppCompatActivity {


    EditText val_weight;
    EditText val_height;
    ImageView imageBoy;
    ImageView imageGirl;
    TextView bmi;
    Double weightValue = 0.0;
    Double heightValue = 0.0;
    Double heightValueinm = 0.0;
    Double bmiValue;
    TextView bmiStatus;
    LinearLayout bmiView;
    TextView calculateAgainButton;
    Button Calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));
        imageBoy = (ImageView) findViewById(R.id.image_boy);
        imageGirl = (ImageView)
                findViewById(R.id.image_girl);
        val_weight = findViewById(R.id.weight_value);
        val_height = findViewById(R.id.height_value);
        bmi = findViewById(R.id.bmi);
        bmiStatus = findViewById(R.id.bmi_status);
        bmiView = findViewById(R.id.bmiView);
        calculateAgainButton = findViewById(R.id.calculate_again);
        Calculate = findViewById(R.id.calculate_button);

        imageBoy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageBoy.setImageResource(R.drawable.male5);
                imageGirl.setImageResource(R.drawable.female2_blur3);
                Toast.makeText(bmi_activity.this, " SELECTED GENDER: MALE", Toast.LENGTH_SHORT).show();
            }
        });


        imageGirl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageBoy.setImageResource(R.drawable.male5_blur);
                imageGirl.setImageResource(R.drawable.female2);
                Toast.makeText(bmi_activity.this, " SELECTED GENDER: FEMALE", Toast.LENGTH_SHORT).show();
            }
        });


        Calculate.setOnClickListener(new View.OnClickListener() {
                                         @Override
                                         public void onClick(View view) {
                                             String weighty = val_weight.getText().toString();
                                             String heighty = val_height.getText().toString();
                                             if (weighty.isEmpty() == true || heighty.isEmpty() == true) {
                                                 Toast.makeText(bmi_activity.this, "Please Input Weight and Height Values greater than 0", Toast.LENGTH_SHORT).show();

                                             } else {
                                                 weightValue = Double.valueOf(weighty);


                                                 heightValue = Double.valueOf(heighty);


                                                 if (weightValue == 0.0 || heightValue == 0.0) {
                                                     Toast.makeText(bmi_activity.this, "Please Input Weight and Height Values greater than 0", Toast.LENGTH_SHORT).show();

                                                 } else {
                                                     heightValueinm = heightValue / 100;
                                                     bmiValue = weightValue / Math.pow(heightValueinm, 2);
                                                     bmiView.setVisibility(View.VISIBLE);
                                                     Calculate.setVisibility(View.GONE);
                                                     val_height.setVisibility(View.GONE);
                                                     val_weight.setVisibility(View.GONE);
                                                     bmiStatusValue(bmiValue);
                                                     //  bermuda();
                                                 }
                                             }
                                         }

                                     }
        );

        calculateAgainButton.setOnClickListener(new View.OnClickListener() {

                                                    @Override
                                                    public void onClick(View view) {

                                                        bmiView.setVisibility(View.GONE);

                                                        Calculate.setVisibility(View.VISIBLE);

                                                        val_height.setVisibility(View.VISIBLE);
                                                        val_weight.setVisibility(View.VISIBLE);
                                                        //Toast.makeText(MainActivity.this, "Inside hui hui calculateAgain", Toast.LENGTH_SHORT).show();
                                                        val_weight.setText("00");
                                                        //  Toast.makeText(MainActivity.this, "Inside calculateAgain", Toast.LENGTH_SHORT).show();
                                                        // val_height.setText(0);
                                                        val_height.setText("00");

                                                        val_weight.requestFocus();
                                                        val_weight.requestFocus();
                                                        heightValue=0.0;
                                                        weightValue=0.0;
                                                    }

                                                }
        );
    }

    private void bmiStatusValue( Double bmiValue){

        if (bmiValue < 18.5)
            bmiStatus.setText("Underweight");
        else if (bmiValue >= 18.5 && bmiValue < 25)
            bmiStatus.setText("Normal");

        else if (bmiValue >= 25 && bmiValue< 30)
            bmiStatus.setText("Overweight");


        else if (bmiValue> 30)
            bmiStatus.setText("Obese");


    }
    private void bermuda(TextView bmiStatus){
        String human = null;
        if(human=="Obese"){
            Toast.makeText(bmi_activity.this, "Decrease weight ", Toast.LENGTH_SHORT).show();

        }
    }




 }

