package com.example.zz3430gs.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button YesButton;
    Button NoButton;
    Button ShowResult;
    Button Reset;
    TextView result;

    Integer no;
    Integer yes;

    ArrayList<Integer> yesList;
    ArrayList<Integer> noList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        YesButton = (Button) findViewById(R.id.yes_button);
        NoButton = (Button) findViewById(R.id.no_button);
        ShowResult = (Button) findViewById(R.id.show_result_button);
        Reset = (Button) findViewById(R.id.reset_button);

        YesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yes = 0;
                yes +=1;
            }
        });
        NoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                no = 0;
                no +=1;
                //Todo: make sure that it adds up everytime it is
                //TODO:clicked or add it to a list and get the number of times or length of that list to display how many the button is clicked

            }
        });
        ShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Yes answers are "+ yes.toString()+ " and no answers are " + no.toString(),Toast.LENGTH_LONG).show();
                //TODO: print out a length of the number of time it is click
            }
        });
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

}

