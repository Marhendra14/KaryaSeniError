package com.example.karyaseni;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class Result extends AppCompatActivity {
    Toolbar toolbar;
    ImageView ivResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        init();

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

        Intent intent = getIntent();
        Bitmap bitmap = (Bitmap) intent.getParcelableExtra("image");
        ivResult.setImageBitmap(bitmap);
    }

    private void init(){
        toolbar = findViewById(R.id.toolbar);
        ivResult = findViewById(R.id.ivResult);
    }
}
