package com.example.fitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class nutrition_activity extends AppCompatActivity {
ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrition);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));

        String[] tstory=getResources().getStringArray(R.array.title_story);

        final String[] dstory=getResources().getStringArray(R.array.details_story);

ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.row,R.id.rowtxt,tstory);
 listView=findViewById(R.id.list);
 listView.setAdapter(adapter);
 listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
     @Override
     public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
String t=dstory[position];
Intent intent=new Intent(nutrition_activity.this,nutrition_item_activity.class);
intent.putExtra("dstory",t);
startActivity(intent);


     }
 });
      //  ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,);
    }
}