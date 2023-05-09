package com.example.fitnesspal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class exercise extends AppCompatActivity {
    String buttonValue;
    Button startBtn;
    private CountDownTimer countDownTimer;
    TextView mtextview;
    private boolean MTimeRunning;
    long MTimeLeftinmills;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise);
        getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.teal_200)));

        Intent intent=getIntent();
        buttonValue=intent.getStringExtra("value");
        int intValue=Integer.valueOf(buttonValue);

        switch(intValue){

            case 1:
                setContentView(R.layout.exercise1);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;

            case 2:
                setContentView(R.layout.exercise2);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 3:
                setContentView(R.layout.exercise3);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 4:
                setContentView(R.layout.exercise4);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 5:
                setContentView(R.layout.exercise5);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 6:
                setContentView(R.layout.exercise6);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 7:
                setContentView(R.layout.exercise7);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 8:
                setContentView(R.layout.exercise8);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 9:
                setContentView(R.layout.exercise9);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 10:
                setContentView(R.layout.exercise10);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 11:
                setContentView(R.layout.exercise11);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 12:
                setContentView(R.layout.exercise12);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 13:
                setContentView(R.layout.exercise13);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 14:
                setContentView(R.layout.exercise14);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;
            case 15:
                setContentView(R.layout.exercise15);
                Toast.makeText(exercise.this,"Click on FITNESS PAL to know more..",Toast.LENGTH_SHORT).show();
                break;

        }
        startBtn=findViewById(R.id.startbutton);
        mtextview=findViewById(R.id.time);
startBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        if(MTimeRunning){
            stopTimer();
        }
        else{
startTimer();
        }
    }
});

    }
    private void stopTimer(){
        countDownTimer.cancel();
        MTimeRunning=false;
        startBtn.setText("START");
        startBtn.setBackground(getResources().getDrawable(R.drawable.start_btn));
    }

    private void startTimer(){

        final CharSequence value1=mtextview.getText();
         String num1=value1.toString();
         String num2=num1.substring(0,2);
         String num3= num1.substring(3,5);


         final int number=Integer.valueOf(num2)*60+Integer.valueOf(num3);
         MTimeLeftinmills=number*1000;

         countDownTimer=new CountDownTimer(MTimeLeftinmills,1000) {

             @Override
             public void onTick(long millisUntilFinished) {
                 MTimeLeftinmills=millisUntilFinished;
                 updateTimer();
             }




             @Override
             public void onFinish() {
                 int newvalue=Integer.valueOf(buttonValue)+1;
                 if(newvalue<=7){
                     Intent intent=new Intent(exercise.this,exercise.class);
                     intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                     intent.putExtra("value",String.valueOf(newvalue));
                     startActivity(intent);


                 }else{
                     newvalue=1;
                     Intent intent=new Intent(exercise.this,exercise.class);
                     intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);
                     intent.putExtra("value",String.valueOf(newvalue));

                     startActivity(intent);
                 }

             }
         }.start();
         startBtn.setText("PAUSE");
         startBtn.setBackground(getResources().getDrawable(R.drawable.stop_btn));
         MTimeRunning=true;

    }


    private void updateTimer() {
        int minutes=(int)MTimeLeftinmills/60000;
        int seconds=(int)MTimeLeftinmills%60000/1000;


        String timeLeftText=" ";
        if(minutes<10) {
            timeLeftText = "0";
        }
        timeLeftText=timeLeftText+minutes+":";
        if(seconds<10){
                timeLeftText+="0";

            }
        timeLeftText+=seconds;
        mtextview.setText(timeLeftText);
        }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }



















    ///////////////////////                -------------------OPEN BROWSER METHODS------------------------------

    public void openBrowser_1(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=DyeZM-_VnRc"));

        startActivity(intent);
    }


    public void openBrowser_2(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=Xyd_fa5zoEU"));

        startActivity(intent);
    }


    public void openBrowser_3(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=jox1rb5krQI"));

        startActivity(intent);
    }


    public void openBrowser_4(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=9FGilxCbdz8"));

        startActivity(intent);
    }


    public void openBrowser_5(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=JB2oyawG9KI"));

        startActivity(intent);
    }


    public void openBrowser_6(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/shorts/oyEnoOnWqvI"));

        startActivity(intent);
    }


    public void openBrowser_7(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=zRMYJf5oe_I"));

        startActivity(intent);
    }


    public void openBrowser_8(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/shorts/xvTE3Klj9T8"));

        startActivity(intent);
    }


    public void openBrowser_9(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=0UIS7TDHMQU"));

        startActivity(intent);
    }


    public void openBrowser_10(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=-hOC0s2YwB8"));

        startActivity(intent);
    }


    public void openBrowser_11(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=B296mZDhrP4"));

        startActivity(intent);
    }


    public void openBrowser_12(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=JyUqwkVpsi8"));

        startActivity(intent);
    }


    public void openBrowser_13(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=3aeMAvPgIsg"));

        startActivity(intent);
    }


    public void openBrowser_14(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=79mRoHMwBaM"));

        startActivity(intent);
    }


    public void openBrowser_15(View view){

        //Get url from tag
        String url = (String)view.getTag();

        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);

        //pass the url to intent data
        intent.setData(Uri.parse("https://www.youtube.com/watch?v=FsbIRLS81qI"));

        startActivity(intent);
    }
}

