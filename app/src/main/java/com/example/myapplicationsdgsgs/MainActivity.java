package com.example.myapplicationsdgsgs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView em, pw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.button16);
        em = (TextView) findViewById(R.id.editTextTextEmailAddress2);
        pw = (TextView) findViewById(R.id.editTextTextPassword2);
        b1.setOnClickListener(new View.OnClickListener() {
            public boolean isemailvalid(CharSequence email) {
                return Patterns.EMAIL_ADDRESS.matcher((email)).matches();
            }

            @Override
            public void onClick(View view) {
                String email = String.valueOf(em.getText());
                String pass=String.valueOf(pw.getText());
                String pattern ="[A-Za-z][A-Za-z0-9@#$%]+";
                Intent conn = new Intent(getApplicationContext(),choose.class);
                if (isemailvalid(email) & pass.matches(pattern) & pass.length()>=8){
                    Toast.makeText(getApplicationContext(), "login succesfull", Toast.LENGTH_SHORT).show();
                    startActivityForResult(conn,1);}
                else
                if (isemailvalid(email))
                    Toast.makeText(getApplicationContext(), "password invalid", Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(getApplicationContext(), "Email invalid", Toast.LENGTH_SHORT).show();

            }
        });
    }
}