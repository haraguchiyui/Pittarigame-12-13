package com.example.yui06.pittaritime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class StarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_star);
    }

    public void button(View v){
        Intent intent= new Intent(this,MainActivity.class);
        intent.putExtra("minutes",10);
        startActivity(intent);



    }
}
