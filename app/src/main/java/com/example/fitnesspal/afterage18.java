package com.example.fitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class afterage18 extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_afterage18);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));

        newArray= new int[]{
R.id.boat_pose1,R.id.boat_pose2,R.id.boat_pose3,R.id.boat_pose4,R.id.boat_pose5,R.id.boat_pose6,R.id.boat_pose7,R.id.boat_pose8,R.id.boat_pose9,R.id.boat_pose10,R.id.boat_pose11,
                R.id.boat_pose12,R.id.boat_pose13,R.id.boat_pose14,R.id.boat_pose15




        };
    }

    public void ImagebuttonClick(View view) {
        for(int i=0;i<newArray.length;i++){
            if(  view.getId()==newArray[i]){
                    int value=i+1;
                Log.d("First",String.valueOf(value));
                Intent intent=new Intent(afterage18.this,exercise.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);


            }




        }
    }

}