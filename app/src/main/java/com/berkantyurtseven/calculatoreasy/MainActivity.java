package com.berkantyurtseven.calculatoreasy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    EditText txt1 ;
    EditText txt2 ;
    TextView resultTxt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt1 = findViewById(R.id.editText1);
        txt2 = findViewById(R.id.editText2);
        resultTxt = findViewById(R.id.ResultTest);
    }

    public void sum(View view){
        if(txt1.getText().toString().matches("")|| txt2.getText().toString().matches("")){
            resultTxt.setText("Please enter number");

        }else{
            int number1 = Integer.parseInt(txt1.getText().toString());
            int number2 = Integer.parseInt(txt2.getText().toString());
            int result = number1 + number2;

            resultTxt.setText("Result" + result);
        }


    }
    public void subtraction(View view){
        if(txt1.getText().toString().matches("")|| txt2.getText().toString().matches("")){
            resultTxt.setText("Please enter number");

        }else{
            int number1 = Integer.parseInt(txt1.getText().toString());
            int number2 = Integer.parseInt(txt2.getText().toString());
            int result = number1 - number2;

            resultTxt.setText("Result" + result);
        }

    }
    public void multiply(View view){
        if(txt1.getText().toString().matches("")|| txt2.getText().toString().matches("")){
            resultTxt.setText("Please enter number");

        }else{
            int number1 = Integer.parseInt(txt1.getText().toString());
            int number2 = Integer.parseInt(txt2.getText().toString());
            int result = number1 * number2;

            resultTxt.setText("Result" + result);
        }

    }
    public void divide(View view){
        if(txt1.getText().toString().matches("")|| txt2.getText().toString().matches("")){
            resultTxt.setText("Please enter number");

        }else{
            int number1 = Integer.parseInt(txt1.getText().toString());
            int number2 = Integer.parseInt(txt2.getText().toString());
            int result = number1 / number2;

            resultTxt.setText("Result" + result);
        }

    }
}