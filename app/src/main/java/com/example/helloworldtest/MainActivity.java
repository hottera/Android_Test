package com.example.helloworldtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//basic java code for main activity

public class MainActivity extends AppCompatActivity {

    //defines what happen when the activity is started
    //initializes a default view from activity main
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void foo(){
        System.out.println("just for pushing purpose");
    }
    //test commit

    //test commit from asus vivobook





    //here is the code form the TestBranch
    public void fooTestBranch(){
        System.out.println("I came from the testBranch");
    }
}