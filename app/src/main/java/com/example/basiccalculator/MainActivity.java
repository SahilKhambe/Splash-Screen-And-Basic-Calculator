package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText txtval1, txtval2;
    private Button btnadd, btnsub, btnmul, btndiv;
    private TextView txtresult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtval1 = findViewById(R.id.txtval1);
        txtval2 = findViewById(R.id.txtval2);
        btnadd = findViewById(R.id.btnadd);
        btnsub = findViewById(R.id.btnsub);
        btnmul = findViewById(R.id.btnmul);
        btndiv = findViewById(R.id.btndiv);

        txtresult = findViewById(R.id.txtresult);
        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Text1 = txtval1.getText().toString();
                String Text2 = txtval2.getText().toString();

                int a = Integer.parseInt(Text1);
                int b = Integer.parseInt(Text2);
                int total = a + b;

                Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                txtresult.setText(Integer.toString(total));
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Text3 = txtval1.getText().toString();
                String Text4 = txtval2.getText().toString();

                int c = Integer.parseInt(Text3);
                int d = Integer.parseInt(Text4);
                int total = c - d;

                Toast.makeText(MainActivity.this, Integer.toString(total), Toast.LENGTH_LONG).show();
                txtresult.setText(Integer.toString(total));
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Text5 = txtval1.getText().toString();
                String Text6 = txtval2.getText().toString();

                double e = Double.parseDouble(Text5);
                double f = Double.parseDouble(Text6);
                double total = e * f;

                Toast.makeText(MainActivity.this, Double.toString(total), Toast.LENGTH_LONG).show();
                txtresult.setText(Double.toString(total));
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String Text7 = txtval1.getText().toString();
                String Text8 = txtval2.getText().toString();

                double g = Double.parseDouble(Text7);
                double h = Double.parseDouble(Text8);
                double total = g / h;

                Toast.makeText(MainActivity.this, Double.toString(total), Toast.LENGTH_LONG).show();
                txtresult.setText(Double.toString(total));
            }
        });
    }
}