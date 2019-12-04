package com.example.college_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
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
  TextView result , total;
  //Student class
    student newstudent;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course);




        welcome1 = findViewById(R.id.welcome);
        welcome1.setText("welcome  " + MainActivity.Studentname);


        newstudent = new student();



        spinner = (Spinner) findViewById(R.id.spinner);

    //make spinner

        ArrayList<String> spinnerdata = new ArrayList<String>();
        spinnerdata.add("Java");
        spinnerdata.add("Swift");
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
        result = findViewById(R.id.result);
        total = findViewById(R.id.total);

    }

    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {


        String ss = adapterView.getItemAtPosition(i).toString();

        //System.out.println("userintput"+ss);

        newstudent.setCourse(ss);

        result.setText("your course is  " +newstudent.getCourse());

       if (ss.equals("Swift")){

           newstudent.setDur(6);
            newstudent.setFee(1500);
        }
       result.setText("your course is  " +newstudent.getCourse()+"duration is = " + newstudent.getDur() + "  fees" + newstudent.getFee() );


        if (ss.equals("Android")){

            newstudent.setDur(7);
            newstudent.setFee(1350);

        }


        result.setText("your course is  " +newstudent.getCourse()+"duration is = " + newstudent.getDur()+ "  fees" + newstudent.getFee() );


        if (ss.equals("Java")){

            newstudent.setDur(6);
            newstudent.setFee(1300);
        }


        result.setText("your course is  " +newstudent.getCourse()+" duration is = " + newstudent.getDur() + "  fees" + newstudent.getFee());



        if (ss.equals("Swift")){

            newstudent.setDur(5);
            newstudent.setFee(1300);
        }


        result.setText("your course is  " +newstudent.getCourse()+"duration is = " + newstudent.getDur() + "  fees" + newstudent.getFee());


        if (ss.equals("Database")){

            newstudent.setDur(4);
            newstudent.setFee(1000);
        }


        result.setText("your course is  " +newstudent.getCourse()+" duration is = " + newstudent.getDur()+"weeks"+ "  fees $" + newstudent.getFee());



    }





    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }


    public void onPointerCaptureChanged(boolean hasCapture) {

    }


    public void oncheck(View view) {

        Boolean checked = ((CheckBox) view).isChecked();


        switch(view.getId()){

            case R.id.cbac:
                if (checked){

                    newstudent.setWithacc(1000);
                }

                else{

                    newstudent.setWithacc(0);
                }


            case R.id.cbmi:
                if (checked){

                    newstudent.setWithm(700);

            }
                else
                {
                    newstudent.setWithm(0);
                    
                }


        }

    total.setText("Total cost with acomodationa and insurance $" +calc());



    }

    public double calc(){
        double  total_price = newstudent.getFee() + newstudent.getWithacc() + newstudent.getWithm();
        return  total_price;
    }





}
