package com.example.spteachingfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ModuleSem1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_sem1);
    }

    public void m1s1(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjHIxeWyx0JeuX3_-GIJ-Mwk"));
        startActivity(browseYT);
    }
    public void m1s2(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjH9Mq7qmTLNlslYBhrbHNl5"));
        startActivity(browseYT);
    }
    public void m1s3(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjHnKojUXyA22mqEBIfk77E-"));
        startActivity(browseYT);
    }
    public void m1s4(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjGQ8D_QciKSaBwW4X7gtYoV"));
        startActivity(browseYT);
    }
    public void m1s5(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjGmyQkUjwNN0BjZEBxtU8cj"));
        startActivity(browseYT);
    }
    public void m1s6(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjEfoPeZmXJjcuR2XO_YdtIe"));
        startActivity(browseYT);
    }
}