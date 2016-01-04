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
        Toast.makeText(this, R.string.spotify_label, Toast.LENGTH_SHORT).show();
    }

    public void footballScoresTapped(View view) {
        Toast.makeText(this, R.string.football_label, Toast.LENGTH_SHORT).show();
    }

    public void libraryTapped(View view) {
        Toast.makeText(this, R.string.library_label, Toast.LENGTH_SHORT).show();
    }

    public void buildItBiggerTapped(View view) {
        Toast.makeText(this, R.string.build_it_bigger_label, Toast.LENGTH_SHORT).show();
    }

    public void xyzReaderTapped(View view) {
        Toast.makeText(this, R.string.xyz_reader_label, Toast.LENGTH_SHORT).show();
    }

    public void capstoneTapped(View view) {
        Toast.makeText(this, R.string.capstone_label, Toast.LENGTH_SHORT).show();
    }
}
