package com.mehmetaltindal.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import javax.xml.transform.Result;

public class MainActivity extends AppCompatActivity {

    EditText editText1;
    EditText editText2;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editText1 = findViewById(R.id.editText1);
         editText2 = findViewById(R.id.editText2);
         textView = findViewById(R.id.textView);


    }

    public void sum(View view){

        if(editText1.getText().toString().matches("") || editText2.toString().matches(""))
        {
            textView.setText("Enter a Number!!");
        } else {
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());

            int result = number1 + number2;
            textView.setText("Result :" + result);
        }

    }
    public void decrease(View view){
        if(editText1.getText().toString().matches("") || editText2.toString().matches(""))
        {
            textView.setText("Enter a Number!!");
        } else {
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());

            int result = number1 - number2;
            textView.setText("Result :" + result);
        }


    }
    public void multiply(View view){
        if(editText1.getText().toString().matches("") || editText2.toString().matches(""))
        {
            textView.setText("Enter a Number!!");
        } else {
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());

            int result = number1 * number2;
            textView.setText("Result :" + result);
        }

    }
    public void divide(View view){
        if(editText1.getText().toString().matches("") || editText2.toString().matches(""))
        {
            textView.setText("Enter a Number!!");
        } else {
            int number1 = Integer.parseInt(editText1.getText().toString());
            int number2 = Integer.parseInt(editText2.getText().toString());

            int result = number1 / number2;
            textView.setText("Result :" + result);
        }

    }
}