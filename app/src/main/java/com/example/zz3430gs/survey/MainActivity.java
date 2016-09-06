package com.example.zz3430gs.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Integer> yesList;
    ArrayList<Integer> noList;

    private final static String SURVEY_KEY = "survey list bundle key";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }
}
