package com.example.android.scorekeeper;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayFor(R.id.scoreA, scoreA);
        displayFor(R.id.scoreB, scoreB);
    }

    /**
     * Displays the given score for Team.
     */
    public void displayFor(int id, int score) {
        TextView mScoreViewA = findViewById(id);
        mScoreViewA.setText(String.valueOf(score));
    }

    /**
     * Add 6 points for Team A.
     */
    public void addSixPointsForTeamA(View v) {
        scoreA += 6;
        displayFor(R.id.scoreA, scoreA);
    }

    /**
     * Add 6 points for Team B.
     */
    public void addSixPointsForTeamB(View v) {
        scoreB += 6;
        displayFor(R.id.scoreB, scoreB);
    }

    /**
     * Add 1 point for Team A.
     */
    public void addOnePointForTeamA(View v) {
        scoreA += 1;
        displayFor(R.id.scoreA, scoreA);
    }

    /**
     * Add 1 point for Team B.
     */
    public void addOnePointForTeamB(View v) {
        scoreB += 1;
        displayFor(R.id.scoreB, scoreB);
    }

    /**
     * Add 2 points for Team A.
     */
    public void addTwoPointsForTeamA(View v) {
        scoreA += 2;
        displayFor(R.id.scoreA, scoreA);
    }

    /**
     * Add 2 points for Team B.
     */
    public void addTwoPointsForTeamB(View v) {
        scoreB += 2;
        displayFor(R.id.scoreB, scoreB);
    }

    /**
     * Add 3 points for Team A.
     */
    public void addThreePointsForTeamA(View v) {
        scoreA += 3;
        displayFor(R.id.scoreA, scoreA);
    }

    /**
     * Add 3 points for Team B.
     */
    public void addThreePointsForTeamB(View v) {
        scoreB += 3;
        displayFor(R.id.scoreB, scoreB);
    }

    /**
     * Reset button.
     */
    public void resetScores(View view) {
        scoreA = 0;
        scoreB = 0;

        displayFor(R.id.scoreA, scoreA);
        displayFor(R.id.scoreB, scoreB);
    }
}
