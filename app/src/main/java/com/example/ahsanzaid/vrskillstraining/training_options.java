package com.example.ahsanzaid.vrskillstraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class training_options extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_options);

        Button vedio_training= (Button)findViewById(R.id.Vedio_training);
        vedio_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(training_options.this,vedio_training_category.class);
                startActivity(intent);
            }
        });

        Button virtual_training=(Button)findViewById(R.id.virtual_training);
        virtual_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(training_options.this,virtual_training_category.class);
                startActivity(intent);

            }
        });
    }
}
