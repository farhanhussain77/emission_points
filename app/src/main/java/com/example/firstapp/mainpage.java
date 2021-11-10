package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class mainpage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);
    }

    public void startQuiz(View view){
        Intent next = new Intent(this, quizActivity.class);
        startActivity(next);
    }

    public void learn(View view){
        Intent myWebLink = new Intent(android.content.Intent.ACTION_VIEW);
        myWebLink.setData(Uri.parse("https://learn-quran-kids.com/tajweed/makharij-emission-points/"));
        startActivity(myWebLink);
    }

}