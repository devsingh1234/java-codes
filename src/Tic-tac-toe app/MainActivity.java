package com.example.gamedemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button restart;
    int player=1;
    int [][] winStates={{0,1,2},{3,4,5},{6,7,8},{0,3,6},{1,4,7},{2,5,8},{0,4,8},{2,4,6}};
    int []gameStates={2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2};
    boolean winner=false;
    public void drop(View view){
        if (!winner) {
            ImageView v = (ImageView) view;
            int clicked = Integer.parseInt(v.getTag().toString());
            if (player == 1) {
                Toast.makeText(this, "Cross and Cell clicked:" + clicked, Toast.LENGTH_SHORT).show();
                v.setImageResource(R.drawable.cross);
                gameStates[clicked]=player;
                player = 0;
            } else {
                Toast.makeText(this, "Zero and Cell clicked:" + clicked, Toast.LENGTH_SHORT).show();
                v.setImageResource(R.drawable.zero);
                gameStates[clicked]=player;
                player = 1;
            }
            for( int i=0;i<winStates.length;i++){
                int[]winState=winStates[i];
                if(gameStates[winState[0]]==gameStates[winState[1]] && gameStates[winState[1]]==gameStates[winState[2]] && gameStates[winState[0]]!=2){
                    winner=true;
                    Toast.makeText(this,"winner is"+(player==0?1:0),Toast.LENGTH_LONG).show();
                }
            }
        }
        else{
            Toast.makeText(this,"Game Over",Toast.LENGTH_SHORT).show();
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        restart= findViewById(R.id.restart);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });
    }
