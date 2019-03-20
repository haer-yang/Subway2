package com.example.subway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp =(Spinner)findViewById(R.id.sp);
        ArrayAdapter spAdapter = ArrayAdapter.createFromResource(this,R.array.branch, android.R.layout.simple_spinner_dropdown_item );
        sp.setAdapter(spAdapter);

    }
}
