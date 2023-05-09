package com.example.fitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class macro_activity extends AppCompatActivity {
    EditText caloriea;
    Button high;

    Button low;
    Button moderate;
    Button zone;
    Double calorieValue = 0.0;
    Double Carbohydrate=0.0;
    Double Protein=0.0;
    Double Fat=0.0;








    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_macro);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));


     caloriea = findViewById(R.id.calorie);
     low=findViewById(R.id.low_carb);
        high=findViewById(R.id.high_carb);
        zone=findViewById(R.id.zone_carb);
        moderate=findViewById(R.id.moderate);



        low.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String calorieS=caloriea.getText().toString();


                if (calorieS.isEmpty() == true) {
                    Toast.makeText(macro_activity.this, "Please Input Calorie Value greater than 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    calorieValue=Double.valueOf(calorieS);
                }

                if (calorieValue==0.0) {
                    Toast.makeText(macro_activity.this, "Please Input Calorie Value greater than 0", Toast.LENGTH_SHORT).show();

                }

                else{
                    Carbohydrate = calorieValue*0.0625;
                    Protein = calorieValue*0.1125;
                    Fat = calorieValue*0.075;


                    Toast.makeText(macro_activity.this, "You would have consumed\nCarbohydrates:"+ Carbohydrate.toString() +"gm\nProteins:"+ Protein.toString() +"gm\nFats:"+ Fat.toString()+"gm" , Toast.LENGTH_SHORT).show();





                }

            }
        });


        high.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String calorieS=caloriea.getText().toString();


                if (calorieS.isEmpty() == true) {
                    Toast.makeText(macro_activity.this, "Please Input Calorie Value greater than 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    calorieValue=Double.valueOf(calorieS);
                }

                if (calorieValue==0.0) {
                    Toast.makeText(macro_activity.this, "Please Input Calorie Value greater than 0", Toast.LENGTH_SHORT).show();

                }
                else{

                    Carbohydrate = calorieValue*0.15;
                    Protein = calorieValue*0.0625;
                    Fat = calorieValue*0.0375;


                    Toast.makeText(macro_activity.this, "You would have consumed\nCarbohydrates:"+ Carbohydrate.toString() +"gm\nProteins:"+ Protein.toString() +"gm\nFats:"+ Fat.toString()+"gm" , Toast.LENGTH_SHORT).show();


                }

            }
        });


        zone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String calorieS=caloriea.getText().toString();


                if (calorieS.isEmpty() == true) {
                    Toast.makeText(macro_activity.this, "Please Input Calorie Value greater than 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    calorieValue=Double.valueOf(calorieS);
                }

                if (calorieValue==0.0) {
                    Toast.makeText(macro_activity.this, "Please Input Calorie Value greater than 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    Carbohydrate = calorieValue*0.1;
                    Protein = calorieValue*0.075;
                    Fat = calorieValue*0.075;


                    Toast.makeText(macro_activity.this, "You would have consumed\nCarbohydrates:"+ Carbohydrate.toString() +"\nProteins:"+ Protein.toString() +"\nFats:"+ Fat.toString()+"gm" , Toast.LENGTH_SHORT).show();


                }

            }
        });


        moderate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String calorieS=caloriea.getText().toString();


                if (calorieS.isEmpty() == true) {
                    Toast.makeText(macro_activity.this, "Please Input Calorie Value greater than 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    calorieValue=Double.valueOf(calorieS);
                }

                if (calorieValue==0.0) {
                    Toast.makeText(macro_activity.this, "Please Input Calorie Value greater than 0", Toast.LENGTH_SHORT).show();

                }
                else{
                    Carbohydrate = calorieValue*0.125;
                    Protein = calorieValue*0.075;
                    Fat = calorieValue*0.05;


                    Toast.makeText(macro_activity.this, "You would have consumed\nCarbohydrates:"+ Carbohydrate.toString() +"gm\nProteins:"+ Protein.toString() +"gm\nFats:"+ Fat.toString()+"gm" , Toast.LENGTH_SHORT).show();


                }

            }
        });

    }

}