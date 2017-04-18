package org.androidtown.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        Button button = (Button) findViewById(R.id.btn);
        final TextView msg1 = (TextView) findViewById(R.id.sms_email);
        final TextView msg2 = (TextView) findViewById(R.id.gender);
        final TextView userName = (TextView) findViewById(R.id.name);

        Intent intent = getIntent();
        if(intent!=null)
        {
            String outName = intent.getStringExtra("username");
            String outGender = intent.getStringExtra("gen");
            String outCheck = intent.getStringExtra("s_e");

            userName.setText("성명: "+outName);
            msg2.setText("성별: "+outGender);
            msg1.setText("수신여부:" +outCheck);
        }
        button.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                finish();
            }

        });
    }
}
