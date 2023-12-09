package com.example.genderspinner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class ResultActivity extends AppCompatActivity {
    ImageView img1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        img1=(ImageView) findViewById(R.id.imgl);
        Intent intent=getIntent();
        String resul=intent.getStringExtra("res");
        if(resul.equals("Male"))
        {
            img1.setImageResource(R.drawable.boy);

        }
        else if (resul.equals("Female"))
        {
            img1.setImageResource(R.drawable.girl1);

        }
        else{
            img1.setImageResource(R.drawable.others);
        }


    }
}
