package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView edtNum1;
    TextView edtNum2;
    TextView rslt;

    String s1;
    String s2;

    int i1;
    int i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
        rslt = findViewById(R.id.rslt);

        Intent i = getIntent();

        s1 = i.getStringExtra("n1");
        s2 = i.getStringExtra("n2");

        edtNum1.setText(s1);
        edtNum2.setText(s2);

        i1 = Integer.parseInt(s1);
        i2 = Integer.parseInt(s2);


    }

    public void sum(View view){
        rslt.setText(i1+" + "+i2+" = "+ (i1+i2));
    }

    public void sub(View view){
        rslt.setText(i1+" - "+i2+" = "+ (i1-i2));
    }

    public void multi(View view){
        rslt.setText(i1+" x "+i2+" = "+ (i1*i2));
    }

    public void div(View view){
        rslt.setText(i1+" / "+i2+" = "+ (i1/i2));
    }
}