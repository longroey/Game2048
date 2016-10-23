package com.ibm.longrory.game2048;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;

public class Game extends Activity {
    private String TAG = "Game";
    private GridBlock mGridBlock;
    private float startX, startY, offSetX, offSetY;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        mGridBlock = (GridBlock) findViewById(R.id.gridblock);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                startX = event.getX();
                startY = event.getY();
                break;
            case MotionEvent.ACTION_UP:
                offSetX = event.getX() - startX;
                offSetY = event.getY() - startY;
                if (Math.abs(offSetX) > Math.abs(offSetY)) {
                    if (offSetX > 10) {
                        slideRight();
                    }
                    if (offSetX < -10) {
                        slideLeft();
                    }
                } else {
                    if (offSetY > 10) {
                        slideDown();
                    }
                    if (offSetY < -10) {
                        slideUp();
                    }
                }
                break;
        }

        return true;
    }

    private void slideRight() {
        Log.d(TAG, "slideRight");

    }

    private void slideLeft() {
        Log.d(TAG, "slideLeft");
    }

    private void slideUp() {
        Log.d(TAG, "slideUp");
    }

    private void slideDown() {
        Log.d(TAG, "slideDown");
    }
}
