package com.example.owais.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {

    TextView textViewUserName,textViewPassword;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        textViewUserName= (TextView) findViewById(R.id.textView2);
        textViewPassword=(TextView) findViewById(R.id.textView3);
        button= (Button) findViewById(R.id.button1);
        Intent intent=getIntent();
        User user= (User) intent.getSerializableExtra("User");
        textViewUserName.setText(user.getUserName());
        textViewPassword.setText(user.getPassWord());
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserDetail userDetail=new UserDetail();
                userDetail.setFirstName("Owais");
                userDetail.setLastName("Ur Rehman");
                Intent intent=new Intent(HomeActivity.this,DetailActivity.class);
                Bundle bundle=new  Bundle();
                bundle.putParcelable("UserDetail",userDetail);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
    }
}
