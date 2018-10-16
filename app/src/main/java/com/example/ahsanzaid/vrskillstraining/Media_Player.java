package com.example.ahsanzaid.vrskillstraining;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class Media_Player extends AppCompatActivity {

    VideoView videoview;
    MediaController mController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_player);

        videoview = (VideoView)findViewById(R.id.videoviewid);

        videoview.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.aloo);

        mController = new MediaController(this);

        mController.setAnchorView(videoview);

        videoview.setMediaController(mController);

        videoview.start();


    }


}
