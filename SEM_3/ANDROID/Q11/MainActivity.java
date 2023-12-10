package com.example.cosmeticlist;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    Spinner sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sp=findViewById(R.id.spinn);
        sp.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        TextView tt1=(TextView) view;
        Intent intent= new Intent(MainActivity.this,ResultActivity.class);
        intent.putExtra("res",tt1.getText());
        startActivity(intent);

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
