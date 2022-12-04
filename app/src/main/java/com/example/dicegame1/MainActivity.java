package com.example.dicegame1;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public static final Random RANDOM = new Random();
    private Button rollDices;
    private ImageView imageView1, imageView2;
    private TextView Player1Score, Player2Score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final int dice[] = {R.drawable.dice1, R.drawable.dice2, R.drawable.dice3, R.drawable.dice4, R.drawable.dice5, R.drawable.dice6};
        rollDices = (Button) findViewById(R.id.rollDices);
        imageView1 = (ImageView) findViewById(R.id.imageView1);
        imageView2 = (ImageView) findViewById(R.id.imageView2);
        Player1Score = (TextView) findViewById(R.id.score1);
        Player2Score = (TextView) findViewById(R.id.score2);

        rollDices.setOnClickListener(v -> {
            Random random = new Random();
            int num1 = random.nextInt(6);
            Random random1 = new Random();
            int num2 = random.nextInt(6);

            imageView1.setImageResource(dice[num1]);
            imageView2.setImageResource(dice[num2]);

            Player1Score.setText("Player 1 Score: " + num1);
            Player2Score.setText("Player 2 Score: " + num2);
        });
    }
}
