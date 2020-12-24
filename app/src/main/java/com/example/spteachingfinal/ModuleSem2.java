package com.example.spteachingfinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class ModuleSem2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_sem2);
    }
    public void m2s1(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjEOcjVvECL7i64M8zhWa5Uf"));
        startActivity(browseYT);
    }
    public void m2s2(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjHm5LwTXTynUIZXGyL3Qlx-"));
        startActivity(browseYT);
    }
    public void m2s3(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjGPr9DKY0FZZE2QdHAW9zOJ"));
        startActivity(browseYT);
    }
    public void m2s4(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjGM5GhWFgsi8iM5t37rN6v5"));
        startActivity(browseYT);
    }
    public void m2s5(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjHVStUm93Epta_ZUCl6JH5M"));
        startActivity(browseYT);
    }
    public void m2s6(View view){
        Intent browseYT = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/playlist?list=PLqQF4RbLwAjEeWsmFZjHp_KlO52O2E9Gq"));
        startActivity(browseYT);
    }
}