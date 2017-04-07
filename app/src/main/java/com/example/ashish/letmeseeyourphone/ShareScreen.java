package com.example.ashish.letmeseeyourphone;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by ankit on 6/4/17.
 */

public class ShareScreen extends AppCompatActivity {
    private EditText shareScreenEditText;
    private Button shareScreenNow;

    @Override
    protected void onCreate(Bundle savedInstancestate) {
        super.onCreate(savedInstancestate);
        setContentView(R.layout.sharescreen);

        shareScreenEditText = (EditText) findViewById(R.id.sharescreenedittext);

        shareScreenNow = (Button) findViewById(R.id.sharescreennow);

        shareScreenNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShareScreen.this, DisplayScreen.class);
                String ROOM_NAME = shareScreenEditText.getText().toString();
                intent.putExtra("ROOM_Name", ROOM_NAME);
                intent.putExtra("Flag", true);
                startActivity(intent);
            }
        });


    }
}
