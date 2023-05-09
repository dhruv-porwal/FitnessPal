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

public class calorimeter_activity extends AppCompatActivity {


    EditText val_weight;
    EditText val_height;
    EditText val_age;
    ImageView imageBoy;
    ImageView imageGirl;
    TextView bmr;
    Double weightValue = 0.0;
    Double heightValue = 0.0;
    Double ageValue = 0.0;

    Double heightValueinm = 0.0;
    Double BMRValue;
    TextView bmrStatus;
    int gender=0;   //    female gender is 1 and male is taken as 0
    LinearLayout bmrView;
    TextView calculateAgainButton;
    Button Calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorimeter);







            getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));
            imageBoy = (ImageView) findViewById(R.id.image_boy);
            imageGirl = (ImageView) findViewById(R.id.image_girl);

            val_weight = findViewById(R.id.weight_value);
            val_height = findViewById(R.id.height_value);
        val_age = findViewById(R.id.age_value);
         bmr = findViewById(R.id.bmr);
            bmrStatus = findViewById(R.id.bmr_status);
            bmrView = findViewById(R.id.bmrView);
            calculateAgainButton = findViewById(R.id.calculate_again);
            Calculate = findViewById(R.id.calculate_button);


            imageBoy.setOnClickListener(view -> {
                imageBoy.setImageResource(R.drawable.male5);
                imageGirl.setImageResource(R.drawable.female2_blur3);
                gender=0;
                Toast.makeText(calorimeter_activity.this, " SELECTED GENDER: MALE", Toast.LENGTH_SHORT).show();
            });


            imageGirl.setOnClickListener(view -> {
                imageBoy.setImageResource(R.drawable.male5_blur);
                imageGirl.setImageResource(R.drawable.female2);
                gender=1;
                Toast.makeText(calorimeter_activity.this, " SELECTED GENDER: FEMALE", Toast.LENGTH_SHORT).show();
            });


            Calculate.setOnClickListener(new View.OnClickListener() {
                                             @Override
                                             public void onClick(View view) {
                                                 String weighty = val_weight.getText().toString();
                                                 String heighty = val_height.getText().toString();
                                                 String agey = val_age.getText().toString();
                                                 if (weighty.isEmpty() == true || heighty.isEmpty() == true || agey.isEmpty() == true) {
                                                     Toast.makeText(calorimeter_activity.this, "Please Input Height, Weight and Age Values greater than 0", Toast.LENGTH_SHORT).show();

                                                 } else {
                                                     weightValue = Double.valueOf(weighty);


                                                     heightValue = Double.valueOf(heighty);
                                                     heightValueinm = heightValue / 100;
                                                     ageValue=Double.valueOf(agey);


                                                     if (weightValue == 0.0 || heightValue == 0.0 || ageValue==0.0) {
                                                         Toast.makeText(calorimeter_activity.this, "Please Input Height, Weight and Age Values greater than 0", Toast.LENGTH_SHORT).show();

                                                     } else {
                                                         heightValueinm = heightValue / 100;
                                                         double heightm=heightValueinm*100;

                                                         if(gender==1){

                                                             BMRValue =10 *weightValue + 6.25* heightm- 5* ageValue-161;

                                                         }
                                                         if(gender==0){



                                                             BMRValue = 10*weightValue+ 6.25* heightm-  5* ageValue+ 5;



                                                         }


                                                         bmrView.setVisibility(View.VISIBLE);
                                                         Calculate.setVisibility(View.GONE);
                                                         val_height.setVisibility(View.GONE);
                                                         val_age.setVisibility(View.GONE);
                                                         val_weight.setVisibility(View.GONE);
                                                         bmrStatusValue( BMRValue);
                                                         //  bermuda();
                                                     }
                                                 }
                                             }

                                         }
            );

            calculateAgainButton.setOnClickListener(new View.OnClickListener() {

                                                        @Override
                                                        public void onClick(View view) {

                                                            bmrView.setVisibility(View.GONE);

                                                            Calculate.setVisibility(View.VISIBLE);

                                                            val_height.setVisibility(View.VISIBLE);
                                                            val_weight.setVisibility(View.VISIBLE);
                                                            val_age.setVisibility(View.VISIBLE);
                                                            //Toast.makeText(MainActivity.this, "Inside hui hui calculateAgain", Toast.LENGTH_SHORT).show();
                                                            val_weight.setText("00");
                                                            //  Toast.makeText(MainActivity.this, "Inside calculateAgain", Toast.LENGTH_SHORT).show();
                                                            // val_height.setText(0);
                                                            val_height.setText("00");
                                                            val_age.setText("00");

                                                            val_weight.requestFocus();
                                                            val_weight.requestFocus();
                                                            val_age.requestFocus();
                                                            heightValue=0.0;
                                                            weightValue=0.0;
                                                            ageValue=0.0;
                                                        }

                                                    }
            );
        }

        private void bmrStatusValue( Double bmrValue){


                bmrStatus.setText(bmrValue.toString()+" Calories/day");


        }



    }
