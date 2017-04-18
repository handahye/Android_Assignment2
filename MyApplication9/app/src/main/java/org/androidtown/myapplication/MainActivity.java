package org.androidtown.myapplication;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle; import android.view.View; import android.widget.Button; import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {
    EditText editText;
    CheckBox SMS;
    CheckBox Email;
    Button btn;
    RadioButton woman;
    RadioButton man;
    RadioGroup man_woman;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = (EditText) findViewById(R.id.txtUserName);
        SMS = (CheckBox) findViewById(R.id.SMS);
        Email = (CheckBox) findViewById(R.id.eMail);
        btn = (Button) findViewById(R.id.button);
        woman = (RadioButton) findViewById(R.id.woman);
        man = (RadioButton) findViewById(R.id.man);
        man_woman = (RadioGroup) findViewById(R.id.man_woman);

        btn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                String msg1 = "";
                String msg2 = "";
                String userName="";
                userName = editText.getText().toString();

                if(SMS.isChecked())
                {
                    msg1 += "SMS ";
                }
                if(Email.isChecked())
                {
                    msg1 += "& e-mail ";
                }
                if(woman.isChecked())
                {
                    msg2 = "여";
                }
                if(man.isChecked())
                {
                    msg2 = "남";
                }
                Intent intent = new Intent (getApplicationContext(),Register.class);
                intent.putExtra("s_e",msg1);
                intent.putExtra("gen",msg2);
                intent.putExtra("username",userName);
                startActivity(intent);

            }
        });

    }
}