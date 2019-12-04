package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username;
    EditText password;
    EditText name;
    Button login;

    public static String Studentname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        name = findViewById(R.id.Name);
        login = findViewById(R.id.login);

    }

    public void loginpress(View view) {


        String userEntry = username.getText().toString();
        String passEntry = password.getText().toString();
        Studentname = name.getText().toString();

        if (userEntry.equals("") || userEntry.equals("") || Studentname.equals("") ) {


            Toast.makeText(getApplicationContext(), "please fill everything", Toast.LENGTH_LONG).show();

        }
        {

            if (userEntry.equals("student1") && passEntry.equals("123456")) {

                System.out.println("helloworld");
                //Studentname = name.getText().toString();
                Intent go = new Intent(this, Course.class);
                startActivity(go);

            } else {

                Toast.makeText(getApplicationContext(), "Invalid username or password", Toast.LENGTH_LONG).show();

            }

        }

    }
}
