package com.example.graphics;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    int i = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void animate(View view){
        ImageView sun = (ImageView) findViewById(R.id.sun);
        ImageView night = (ImageView) findViewById(R.id.night);
        ImageView morn = (ImageView) findViewById(R.id.morning);
        if(i == 0){
            sun.animate().alpha(1).setDuration(2000);
            sun.animate().translationYBy(-1450).setDuration(2000);
            night.animate().alpha(0).setDuration(2000);
            morn.animate().alpha(0.7f).setDuration(2000);
            i = 1;
        }else{
            sun.animate().translationYBy(1450).setDuration(2000);
            sun.animate().alpha(0).setDuration(2000);
            night.animate().alpha(1).setDuration(2000);
            morn.animate().alpha(0).setDuration(2000);
            i = 0;
        }
    }
}