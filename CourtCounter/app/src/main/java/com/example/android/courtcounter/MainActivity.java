package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addSixTeamA(View view) {
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    public void addOneTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void addSixTeamB(View view) {
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    public void addThreeTeamB(View view) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    public void addTwoTeamB(View view) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    public void addOneTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    public void reset(View view) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
