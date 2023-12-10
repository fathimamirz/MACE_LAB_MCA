package com.example.cosmeticlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
    TextView t1;
    ImageView i1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        t1=findViewById(R.id.text1);
        i1=findViewById(R.id.img1);
        Intent intent=getIntent();
        String resul=intent.getStringExtra("res");
        if(resul.equals("Lipstick"))
        {
            t1.setText("Price of Lipstick is 200");
            i1.setImageResource(R.drawable.lips);

        }
        else if(resul.equals("Foundation"))
        {
            t1.setText("Price of Foundation is 500");
            i1.setImageResource(R.drawable.founda);
        }
        else
        {
            t1.setText("Price of eyeliner is 120");
            i1.setImageResource(R.drawable.eye);
        }

    }
}
