package com.example.trabalhoswipe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvUp, tvDown, tvLeft, tvRight;
    private LinearLayout tela;
    private int  contUp = 0, contDown = 0, contLeft = 0, contRight = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUp = findViewById(R.id.tvUp);
        tvDown = findViewById(R.id.tvDown);
        tvLeft = findViewById(R.id.tvLeft);
        tvRight = findViewById(R.id.tvRight);
        tela = findViewById(R.id.tela);

        tela.setOnTouchListener( new OnSwipeTouchListener(this) {

            @Override
            public void onSwipeTop() {
                super.onSwipeTop();
                contUp++;
                tvUp.setText( String.valueOf( contUp ) );
            }

            @Override
            public void onSwipeBottom() {
                super.onSwipeBottom();
                contDown++;
                tvDown.setText( String.valueOf( contDown ) );
            }

            @Override
            public void onSwipeLeft() {
                super.onSwipeLeft();
                contLeft++;
                tvLeft.setText( String.valueOf( contLeft ) );
            }

            @Override
            public void onSwipeRight() {
                super.onSwipeRight();
                contRight++;
                tvRight.setText( String.valueOf( contRight ) );
            }
        });


    }
}
