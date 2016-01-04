package com.bryanbryce.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void spotifyStreamerTapped(View view) {
        Toast.makeText(this, "Spotify Streamer", Toast.LENGTH_SHORT).show();
    }

    public void footballScoresTapped(View view) {
        Toast.makeText(this, "Football Scores", Toast.LENGTH_SHORT).show();
    }

    public void libraryTapped(View view) {
        Toast.makeText(this, "Library App", Toast.LENGTH_SHORT).show();
    }

    public void buildItBiggerTapped(View view) {
        Toast.makeText(this, "Build it Bigger", Toast.LENGTH_SHORT).show();
    }

    public void xyzReaderTapped(View view) {
        Toast.makeText(this, "XYZ Reader", Toast.LENGTH_SHORT).show();
    }

    public void capstoneTapped(View view) {
        Toast.makeText(this, "Capstone", Toast.LENGTH_SHORT).show();
    }
}
