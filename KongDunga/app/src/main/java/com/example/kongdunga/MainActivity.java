package com.example.kongdunga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button signInBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void checker(View view) {

        username = findViewById(R.id.edTxtMobile1);
        password = findViewById(R.id.edTxtPass1);
        signInBtn = findViewById(R.id.signInBtn);

        String usernam = username.getText().toString();
        String passwor = password.getText().toString();

        if (usernam.isEmpty() && passwor.isEmpty()) {
            Toast.makeText(getApplicationContext(), "fill all Fields", Toast.LENGTH_SHORT).show();
        }

        if (!(usernam.isEmpty()) && passwor.isEmpty()) {
            Toast.makeText(getApplicationContext(), "fill password field", Toast.LENGTH_SHORT).show();
        }


        if (usernam.isEmpty() && !(passwor.isEmpty())) {

            Toast.makeText(getApplicationContext(), "Fill mobile field", Toast.LENGTH_SHORT).show();


        } else {


            Intent intent = new Intent(MainActivity.this, Information.class);
            startActivity(intent);
        }


    }

    public void goInformation(View view) {

        Intent i = new Intent(this, Information.class);
        startActivity(i);

    }


}
