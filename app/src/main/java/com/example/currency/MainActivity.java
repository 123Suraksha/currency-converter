package com.example.currency;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) final Button b1 = (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                final EditText e1 = (EditText) findViewById(R.id.editText2);
                final TextView t1 = (TextView) findViewById(R.id.textView2);
                final RadioGroup ag = (RadioGroup) findViewById(R.id.radioGroup1);
                final RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup);
                final int j = ag.getCheckedRadioButtonId();
                final int i = rg.getCheckedRadioButtonId();
                final RadioButton rd = (RadioButton) findViewById((int) i);
                final RadioButton ad = (RadioButton) findViewById((int) j);
                float ab = Float.parseFloat(e1.getText().toString());
                if (rd.getText().equals("USD") && ad.getText().equals("INR")) {
                    t1.setText(String.valueOf(ab * 0.013));
                } else if (rd.getText().equals("EURO") && ad.getText().equals("INR")) {
                    t1.setText(String.valueOf(ab * 0.012));
                } else if (rd.getText().equals("YEN") && ad.getText().equals("INR")) {
                    t1.setText(String.valueOf(ab * 1.72));
                } else if (rd.getText().equals("USD") && ad.getText().equals("EURO")) {
                    t1.setText(String.valueOf(ab * 1.04));
                } else if (rd.getText().equals("YEN") && ad.getText().equals("EURO")) {
                    t1.setText(String.valueOf(ab * 141.29));
                } else if (rd.getText().equals("EURO") && ad.getText().equals("YEN")) {
                    t1.setText(String.valueOf(ab * 0.0071));
                } else if (rd.getText().equals("USD") && ad.getText().equals("YEN")) {
                    t1.setText(String.valueOf(ab * 0.0074));
                } else if (rd.getText().equals("YEN") && ad.getText().equals("USD")) {
                    t1.setText(String.valueOf(ab * 135.46));
                } else if (rd.getText().equals("EURO") && ad.getText().equals("USD")) {
                    t1.setText(String.valueOf(ab * 0.96));
                } else if (rd.getText().equals("USD") && ad.getText().equals("USD")) {
                    t1.setText(String.valueOf(ab));
                } else if (rd.getText().equals("EURO") && ad.getText().equals("EURO")) {
                    t1.setText(String.valueOf(ab));
                } else if (rd.getText().equals("YEN") && ad.getText().equals("YEN")) {
                    t1.setText(String.valueOf(ab));
                } else if (rd.getText().equals("INR") && ad.getText().equals("INR")) {
                    t1.setText(String.valueOf(ab));
                } else if (rd.getText().equals("INR") && ad.getText().equals("USD")) {
                    t1.setText(String.valueOf(ab * 79.15));
                } else if (rd.getText().equals("INR") && ad.getText().equals("EURO")) {
                    t1.setText(String.valueOf(ab * 80.60));
                } else if (rd.getText().equals("INR") && ad.getText().equals("YEN")) {
                    t1.setText(String.valueOf(ab * 0.58));
                } else {
                    t1.setText("ERROR");
                }


            }
        });


    }
}



