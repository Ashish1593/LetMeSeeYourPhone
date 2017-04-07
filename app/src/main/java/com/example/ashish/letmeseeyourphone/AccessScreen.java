package com.example.ashish.letmeseeyourphone;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ankit on 6/4/17.
 */

public class AccessScreen extends AppCompatActivity {

    private Button accessScreen;
    private EditText accessScreenEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.accessscreen);
        accessScreen = (Button) findViewById(R.id.accesscreennow);

        accessScreenEditText = (EditText) findViewById(R.id.accessscreenedittext);


        accessScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AccessScreen.this, DisplayScreen.class);

                String ROOM_NAME = accessScreenEditText.getText().toString();
                intent.putExtra("ROOM_Name", ROOM_NAME);
                intent.putExtra("Flag", false);
                startActivity(intent);

            }
        });

    }
}

