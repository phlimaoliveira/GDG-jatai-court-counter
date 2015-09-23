package com.example.fox.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Integer counterA = 0;
    private Integer counterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayPoints();
    }

    public void threePointsTeamA(View view) {
        counterA = counterA + 3;
        displayPoints();
    }

    public void twoPointsTeamA(View view) {
        counterA = counterA + 2;
        displayPoints();
    }

    public void freeThrowA(View view) {
        counterA = counterA + 1;
        displayPoints();
    }

    public void threePointsTeamB(View view) {
        counterB = counterB + 3;
        displayPoints();
    }

    public void twoPointsTeamB(View view) {
        counterB = counterB + 2;
        displayPoints();
    }

    public void freeThrowB(View view) {
        counterB = counterB + 1;
        displayPoints();
    }

    public void reset(View view) {
        counterA = 0;
        counterB = 0;
        displayPoints();
    }

    public void displayPoints() {
        TextView counterTeamA = (TextView) findViewById(R.id.counter_time_a);
        TextView counterTeamB = (TextView) findViewById(R.id.counter_time_b);

        counterTeamA.setText(String.valueOf(counterA));
        counterTeamB.setText(String.valueOf(counterB));
    }

}
