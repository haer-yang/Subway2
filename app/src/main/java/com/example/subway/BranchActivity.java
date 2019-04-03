package com.example.subway;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;



public class BranchActivity extends AppCompatActivity {


    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner sp =(Spinner)findViewById(R.id.sp);
        ArrayAdapter spAdapter = ArrayAdapter.createFromResource(this,R.array.branch, android.R.layout.simple_spinner_dropdown_item );
        sp.setAdapter(spAdapter);




    }
    View.OnClickListener next_click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    };


    @Override
    protected void onStart() {
        super.onStart();

        next =(Button)findViewById(R.id.next);
        next.setOnClickListener(next_click);


    }

    

    


}
