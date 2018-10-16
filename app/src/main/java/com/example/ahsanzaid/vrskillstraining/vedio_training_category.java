package com.example.ahsanzaid.vrskillstraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vedio_training_category extends AppCompatActivity {


    Button start_training;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vedio_training_category);

        start_training = (Button)findViewById(R.id.start_training);

        start_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(vedio_training_category.this,Media_Player.class);
                startActivity(intent);
            }
        });
    }
}
