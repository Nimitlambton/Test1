package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Course extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

  TextView welcome1;
  Spinner spinner;
  RadioGroup type;
  RadioButton rbug ,rbg;
  CheckBox cbac, cbmi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);

        welcome1 = findViewById(R.id.welcome);
        welcome1.setText("welcome  " + MainActivity.Studentname);


        //spinner

        spinner = (Spinner) findViewById(R.id.spinner);

    //make spinner

        ArrayList<String> spinnerdata = new ArrayList<String>();
        spinnerdata.add("Java");
        spinnerdata.add("iOS");
        spinnerdata.add("Swift");
        spinnerdata.add("Android");
        spinnerdata.add("Database");


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, spinnerdata);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



       // radiobutton

       rbug = findViewById(R.id.rb_ug);
       rbg = findViewById(R.id.rb_g);

       //radioGroup

        type= findViewById(R.id.type);

        //checkbox

        cbac = findViewById(R.id.cbac);
        cbmi  = findViewById(R.id.cbmi);







    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

        String ss = adapterView.getItemAtPosition(i).toString();

        System.out.println(ss);
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
