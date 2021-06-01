package com.example.cal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edtNum1;
    EditText edtNum2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNum1 = findViewById(R.id.edtNum1);
        edtNum2 = findViewById(R.id.edtNum2);
    }

    public void Ok(View view){
        Intent i = new Intent(MainActivity.this,MainActivity2.class);
        i.putExtra("n1",edtNum1.getText().toString());
        i.putExtra("n2",edtNum2.getText().toString());

        startActivity(i);

    }
}