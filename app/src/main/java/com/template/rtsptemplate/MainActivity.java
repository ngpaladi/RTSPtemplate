package com.template.rtsptemplate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.VideoView;
import android.widget.MediaController;
import android.net.Uri;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button start = (Button) findViewById(R.id.StartButton);
        start.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View v) {
                        toVideo();
                    }
                }
        );
    }
    void toVideo(){
        setContentView(R.layout.video);
        VideoView rtspView = (VideoView) findViewById(R.id.videoView);
        MediaController mc = new MediaController(this);
        rtspView.setMediaController(mc);
        rtspView.setVideoURI(Uri.parse("rtsp://vanseg-1.arc.nasa.gov/encoder/live.rm"));
        rtspView.start();
    }
}
