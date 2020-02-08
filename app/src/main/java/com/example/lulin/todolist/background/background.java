package com.example.lulin.todolist.background;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.lulin.todolist.Activity.MainActivity;
import com.example.lulin.todolist.R;
import com.example.lulin.todolist.assignment.language;

public class background extends AppCompatActivity {

    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;

    private LinearLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_background);


        button1= (Button) this.findViewById(R.id.button1);
        button2= (Button) this.findViewById(R.id.button2);
        button3= (Button) this.findViewById(R.id.button3);
        button4= (Button) this.findViewById(R.id.button4);
        button5= (Button) this.findViewById(R.id.button5);
        layout= (LinearLayout) this.findViewById(R.id.layout);

;



        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    layout.setBackgroundResource(R.drawable.ic_img1);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundResource(R.drawable.ic_img2);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundResource(R.drawable.ic_img3);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.setBackgroundResource(R.drawable.ic_img4);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        Intent intent5 = new Intent(background.this, MainActivity.class);
        startActivityForResult(intent5,1);
            }
        });
}
    }