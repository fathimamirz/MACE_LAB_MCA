package com.example.simplecalculator;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, add, sub, div, mul, clr, eql;
    TextView disp;
    double num1 = 0;
    double num2 = 0;
    String op = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b0 = findViewById(R.id.b0);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        b4 = findViewById(R.id.b4);
        b5 = findViewById(R.id.b5);
        b6 = findViewById(R.id.b6);
        b7 = findViewById(R.id.b7);
        b8 = findViewById(R.id.b8);
        b9 = findViewById(R.id.b9);
        add = findViewById(R.id.add);
        sub = findViewById(R.id.sub);
        mul = findViewById(R.id.mul);
        div = findViewById(R.id.div);
        clr = findViewById(R.id.clr);
        eql = findViewById(R.id.eql);
        disp = findViewById(R.id.disp);

        b0.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);
        add.setOnClickListener(this);
        sub.setOnClickListener(this);
        mul.setOnClickListener(this);
        div.setOnClickListener(this);
        clr.setOnClickListener(this);
        eql.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Button b = (Button) view;
        if (view == clr) {
            disp.setText("");
        } else if (view == sub || view == add || view == mul || view == div) {
            num1 = Integer.parseInt(disp.getText().toString());
            op = b.getText().toString();
            disp.setText("");
        } else if (view == eql) {
            num2 = Integer.parseInt(disp.getText().toString());
            if (op.equals("+")) {
                disp.setText(num1 + num2 + "");
            } else if (op.equals("-")) {
                disp.setText(num1 - num2 + "");
            } else if (op.equals("*")) {
                disp.setText(num1 * num2 + "");
            } else if (op.equals("/")) {
                disp.setText(num1 / num2 + "");
            }
        } else {
            String s = disp.getText().toString();
            disp.setText(s + b.getText().toString());
        }
    }
}
