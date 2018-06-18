package com.example.hp.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addOneForTeamA(View v) {
        score += 1;
        displayForTeamA(score);
    }

    public void addTwoForTeamA(View v) {
        score += 2;
        displayForTeamA(score);
    }

    /**
     * Second Team
     */
    public void addOneForTeamB(View v) {
        score += 1;
        displayForTeamB(score);
    }

    public void addTwoForTeamB(View v) {
        score += 2;
        displayForTeamB(score);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    public void resetScore(View v) {
        score = 0;
        displayForTeamA(score);
        displayForTeamB(score);
    }
}
