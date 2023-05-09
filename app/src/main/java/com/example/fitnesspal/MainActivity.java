package com.example.fitnesspal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
BottomNavigationView bnView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));







        bnView=findViewById(R.id.bn_view);

        bnView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId())
                {







                    case R.id.about:
                        showDialog2();
                        return true;
                    case R.id.nav_home:
                        return true;
                       // Toast.makeText(MainActivity.this,"toasty2",Toast.LENGTH_SHORT).show();

                    case R.id.nav_workouts:
                        showDialog();
                        return true;
                }
                return false;
            }
        });





     }


    private void showDialog() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout);

        LinearLayout macroLayout = dialog.findViewById(R.id.macro);
        LinearLayout bmrLayout = dialog.findViewById(R.id.bmr);
        LinearLayout bmiLayout = dialog.findViewById(R.id.bmi);


        macroLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Intent intent=new Intent(MainActivity.this,macro_activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Macro Calculator",Toast.LENGTH_SHORT).show();

            }
        });

        bmrLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Intent intent=new Intent(MainActivity.this,calorimeter_activity.class);
                startActivity(intent);
                Toast.makeText(MainActivity.this,"Basal Metabolic Rate (BMR)",Toast.LENGTH_SHORT).show();

            }
        });

        bmiLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Toast.makeText(MainActivity.this,"Body Mass Index (BMI)",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,bmi_activity.class);
                startActivity(intent);

            }
        });



        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);

    }













    ////////////////////////









    private void showDialog2() {

        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.bottomsheetlayout_about);

        LinearLayout AboutLayout = dialog.findViewById(R.id.layout_About);
        LinearLayout ExitLayout = dialog.findViewById(R.id.layout_Exit);
        LinearLayout HelpLayout = dialog.findViewById(R.id.layout_Help);


        AboutLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                Intent intent=new Intent(MainActivity.this,About_activity.class);
                startActivity(intent);

            }
        });

        ExitLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
                finish();
//               System.exit(0);
               // Toast.makeText(MainActivity.this,"Exit is Clicked",Toast.LENGTH_SHORT).show();

            }
        });

        HelpLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                dialog.dismiss();
               // Toast.makeText(MainActivity.this,"Help is Clicked",Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(MainActivity.this,Help_activity.class);
                startActivity(intent);

            }
        });



        dialog.show();
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT,ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        dialog.getWindow().getAttributes().windowAnimations = R.style.DialogAnimation;
        dialog.getWindow().setGravity(Gravity.BOTTOM);

    }

    public void afterage18(View view) {
        Intent intent =new Intent(MainActivity.this,afterage18.class);
        startActivity(intent);
    }

    public void beforeage18(View view) {
        Intent intent =new Intent(MainActivity.this,beforeage18.class);
        startActivity(intent);
    }

    public void nutritiontips(View view) {
        Intent intent =new Intent(MainActivity.this,nutrition_activity.class);
        startActivity(intent);

    }


    ///////////////////////////
}