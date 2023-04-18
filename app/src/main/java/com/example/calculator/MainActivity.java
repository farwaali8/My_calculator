package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
Button button,button1;


EditText editText1,editText2,editText3,editText4;
TextView textview1,textview2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button=findViewById(R.id.button);
        editText1=findViewById(R.id.editTextNumberDecimal3);
        editText2=findViewById(R.id.editTextNumberDecimal4);
        textview1=findViewById(R.id.textView5);

        button1 = findViewById(R.id.button2);
        editText3 = findViewById(R.id.editTextNumberDecimal6);
        editText4 = findViewById(R.id.editTextNumberDecimal7);
        textview2 = findViewById(R.id.textView7);

     button.setOnClickListener(new View.OnClickListener()
     {
         @Override
         public void onClick(View v)
         {
             double num1=Double.parseDouble(editText1.getText().toString());
             double num2=Double.parseDouble(editText2.getText().toString());
              double num3=( num1*num2)/100.0;
              textview1.setText(String.valueOf(num3));

         }
     });
     button1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v)
         {
             double num4=Double.parseDouble(editText3.getText().toString());
             double num5=Double.parseDouble(editText4.getText().toString());
             double num6=( num4/num5)*100.0;
             textview2.setText(String.valueOf(num6));
         }
     });





    }
}