package com.example.spteachingfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public Button button,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.basic);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjGuuaVozY1hswAIEktk8r2S"));
                startActivity(browseYT);
            }
        });


        button = (Button) findViewById(R.id.sem1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleSem1.class);
                startActivity(intent);
            }
        });


        b2 = (Button) findViewById(R.id.sem2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,ModuleSem2.class);
                startActivity(intent);
            }
        });


        button = (Button) findViewById(R.id.other);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjFxaolEmKJM1FcbsFLAxZFf"));
                startActivity(browseYT);
            }
        });

    }
}