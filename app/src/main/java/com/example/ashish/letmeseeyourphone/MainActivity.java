package com.example.ashish.letmeseeyourphone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Simple application demonstrating the use of
 * Android Media Projection API and Skylink for Android
 * <p>
 * Media projection code referred from
 * https://github.com/mtsahakis/MediaProjectionDemo
 */

public class MainActivity extends Activity {

    private Button shareScreen;
    private Button accessScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        shareScreen = (Button) findViewById(R.id.sharescreen);
        accessScreen = (Button) findViewById(R.id.accessscreen);

        shareScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShareScreen.class);
                startActivity(intent);
            }
        });

        accessScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AccessScreen.class);
                startActivity(intent);
            }
        });


    }


}
