package com.example.ahsanzaid.vrskillstraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class virtual_training_category extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_virtual_training_category);

        Button vr_training= (Button)findViewById(R.id.training);
        Button vr_guide= (Button)findViewById(R.id.guide);
        Button vr_reults= (Button)findViewById(R.id.results);

        vr_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(virtual_training_category.this,vr_training.class);
                startActivity(intent);
            }
        });


        vr_guide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(virtual_training_category.this,vr_guide.class);
                startActivity(intent);
            }
        });




        vr_reults.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(virtual_training_category.this,vr_results.class);
                startActivity(intent);
            }
        });
    }
}
