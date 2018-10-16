package com.example.ahsanzaid.vrskillstraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vr_training extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr_training);

        Button training=(Button)findViewById(R.id.carpenting);
        training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(vr_training.this,Modes.class);
                startActivity(intent);


            }
        });

    }
}
