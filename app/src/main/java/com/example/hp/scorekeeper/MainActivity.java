package com.example.hp.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addOneForTeamA(View v){
        score+=1;
        displayForTeamA(score);
    }
    public void addOneForTeamB(View v){
        score+=2;
        displayForTeamA(score);
    }
    public void displayForTeamA(int score){
        TextView scoreView  = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

}
