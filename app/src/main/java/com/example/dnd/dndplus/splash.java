package com.example.dnd.dndplus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);




        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
