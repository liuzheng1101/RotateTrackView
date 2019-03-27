package com.androidbook.snackview;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RotateTrackView rotateTrackView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        rotateTrackView = new RotateTrackView(this, 500, 600, 250, 180, 30);
        setContentView(rotateTrackView);
        rotateTrackView.setLinesWidth(20);
        rotateTrackView.startAnim();
    }
}
