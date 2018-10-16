package com.example.ahsanzaid.vrskillstraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.BufferUnderflowException;

public class Modes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modes);


        Button mode_begin=(Button)findViewById(R.id.Beginner);
        Button mode_inter=(Button)findViewById(R.id.Intermediate);
        Button mode_advance=(Button)findViewById(R.id.advance);


        mode_begin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Modes.this,beginner_levels.class);
                startActivity(intent);
            }
        });

        mode_inter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Modes.this,Intermediate_level.class);
                startActivity(intent);
            }
        });


        mode_advance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Modes.this,Advance_level.class);
                startActivity(intent);
            }
        });




    }
}
