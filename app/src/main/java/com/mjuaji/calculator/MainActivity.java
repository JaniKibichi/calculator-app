package com.mjuaji.calculator;

import android.renderscript.Double2;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //user entry
    private EditText operand1;
    private EditText operand2;
    //action buttons
    private Button btnAddition;
    private Button btnSubtraction;
    private Button btnMultiplication;
    private Button btnDivision;
    private Button btnClear;
    //display result
    private TextView txtResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connect class with view
        operand1 = (EditText)findViewById(R.id.editOperand1);
        operand2 = (EditText)findViewById(R.id.editOperand2);

        btnAddition = (Button) findViewById(R.id.btnAddition);
        btnSubtraction = (Button) findViewById(R.id.btnSubtraction);
        btnMultiplication = (Button) findViewById(R.id.btnMultiplication);
        btnDivision = (Button) findViewById(R.id.btnDivision);
        btnClear = (Button) findViewById(R.id.btnClear);

        txtResult = (TextView) findViewById(R.id.txtResult);
        //set listeners
        btnAddition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 + oper2;
                    txtResult.setText(Double.toString(theResult));
                }else{
                    Toast.makeText(MainActivity.this,"Please enter input in both fields.",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 - oper2;
                    txtResult.setText(Double.toString(theResult));
                }else{
                    Toast.makeText(MainActivity.this, "Please enter input in both fields.",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 * oper2;
                    txtResult.setText(Double.toString(theResult));
                }else{
                    Toast.makeText(MainActivity.this,"Please enter input in both fields.",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((operand1.getText().length()>0)&&(operand2.getText().length()>0)) {
                    double oper1 = Double.parseDouble(operand1.getText().toString());
                    double oper2 = Double.parseDouble(operand2.getText().toString());
                    double theResult = oper1 / oper2;
                    txtResult.setText(Double.toString(theResult));
                }else{
                    Toast.makeText(MainActivity.this,"Please enter input in both fields.",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 operand1.setText("");
                 operand2.setText("");
                 txtResult.setText("0.00");
                //return focus to the first field
                operand1.requestFocus();
            }
        });

    }
}
