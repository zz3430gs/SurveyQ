package com.example.zz3430gs.survey;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class MainActivity extends AppCompatActivity {

    //Buttons that are global
    Button YesButton;
    Button NoButton;
    Button ShowResult;
    Button Reset;

    ArrayList<String> yesList;
    ArrayList<String> noList;

    private static final String YES_LIST_BUNDLE_KEY = "List bundle key";
    private static final String NO_LIST_BUNDLE_KEY = "List bundle key";

    protected void onSaveInstanceState(Bundle outBundle){
        outBundle.putStringArrayList(YES_LIST_BUNDLE_KEY, yesList);
        outBundle.putStringArrayList(NO_LIST_BUNDLE_KEY, noList);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState != null){
            yesList = savedInstanceState.getStringArrayList(YES_LIST_BUNDLE_KEY);
        }
        //If the list is null create it
        if (yesList == null){
            yesList = new ArrayList<String>();
        }
        if (noList == null){
            noList = new ArrayList<String>();
        }

        YesButton = (Button) findViewById(R.id.yes_button);
        NoButton = (Button) findViewById(R.id.no_button);
        ShowResult = (Button) findViewById(R.id.show_result_button);
        Reset = (Button) findViewById(R.id.reset_button);


        //Every time the button is clicked adds to the yes list
        YesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                yesList.add("yes");
            }
        });
        //Same as yes button adds to list when clicked
        NoButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                noList.add("no");
            }
        });

        //When clicked a message will show saying the amount of times a button been pressed
        ShowResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "There are " + yesList.size() + " answers and there are " + noList.size() + " answers.", Toast.LENGTH_LONG).show();

            }
        });

        //Clears both of the list
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                yesList.clear();
                noList.clear();
            }
        });
    }

}

