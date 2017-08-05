package com.example.android.weekify;
//TODO Implement the same structure for the rest of the days in a week
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Change activity when Monday Button is clicked.
    // parameter View: it is the view obj that has been clicked
    public void clickMonday(View view){
        Intent mondayIntent = new Intent(this, MondayActivity.class);
        // start the new activity
        startActivity(mondayIntent);
    }

    public void clickTuesday(View view){
        Intent tuesdayIntent = new Intent(this, TuesdayActivity.class);
        // start the new activity
        startActivity(tuesdayIntent);
    }


    public void clickWednesday(View view){
        Intent wednesdayIntent = new Intent(this, WednesdayActivity.class);
        // start the new activity
        startActivity(wednesdayIntent);
    }


    public void clickThursday(View view){
        Intent thursdayIntent = new Intent(this, ThursdayActivity.class);
        // start the new activity
        startActivity(thursdayIntent);
    }


    public void clickFriday(View view){
        Intent fridayIntent = new Intent(this, FridayActivity.class);
        // start the new activity
        startActivity(fridayIntent);
    }


    public void clickSaturday(View view){
        Intent saturdayIntent = new Intent(this, SaturdayActivity.class);
        // start the new activity
        startActivity(saturdayIntent);
    }


    public void clickSunday(View view){
        Intent sundayIntent = new Intent(this, SundayActivity.class);
        // start the new activity
        startActivity(sundayIntent);
    }



}
