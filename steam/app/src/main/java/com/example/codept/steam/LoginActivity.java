package com.example.codept.steam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private static EditText uname;
    private static EditText password;
    private static Button btn;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
    }
    public void login()
    {
        uname = (EditText)findViewById(R.id.editText);
        password = (EditText)findViewById(R.id.editText6);

        btn = (Button)findViewById(R.id.button3);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v)
                    {
                        if(uname.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                        if(uname.getText().toString().equals("admin") && password.getText().toString().equals("admin"))
                        {
                            Toast.makeText(Login.this,"VALID CREDENTIALS",Toast.LENGTH_SHORT).show();
                        }
                        else
                        {
                            Toast.makeText(Login.this,"INVALID CREDENTIALS",Toast.LENGTH_SHORT).show();
                        }
                    }
                }
        );
    }
}
