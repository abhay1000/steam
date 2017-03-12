package com.example.codept.steam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {
    private static EditText uname;
    private static EditText pass;
    private static Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        login();
    }
    public void login()
    {
        uname = (EditText)findViewById(R.id.editText);
        pass = (EditText)findViewById(R.id.editText6);

        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(
                new View.OnClickListener() {
         @Override
                 public void onClick(View v)
        {
            if(uname.getText().toString().equals("admin") && pass.getText().toString().equals("admin"))
            {
                Toast.makeText(LoginActivity.this,"VALID CREDENTIALS",Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(LoginActivity.this,"INVALID CREDENTIALS",Toast.LENGTH_SHORT).show();
            }
        }
    }
        );
    }
}
