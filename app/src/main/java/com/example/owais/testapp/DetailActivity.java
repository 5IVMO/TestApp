package com.example.owais.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    TextView textViewFirstName,textViewLastName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textViewFirstName=(TextView) findViewById(R.id.textView4);
        textViewLastName=(TextView) findViewById(R.id.textView5);
        Intent intent=getIntent();
        UserDetail userDetail=intent.getParcelableExtra("UserDetail");
        textViewFirstName.setText(userDetail.getFirstName());
        textViewLastName.setText(userDetail.getLastName());
    }
}
