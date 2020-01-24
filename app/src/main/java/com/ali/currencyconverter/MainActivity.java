package com.ali.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public void convertCurrency(View view){
        EditText myInputAmount = findViewById(R.id.CurrentyTexttInput);
        TextView myOutputAmount = findViewById(R.id.ConvertedCurrencyTextOutput);
        myOutputAmount.setText(String.format("%.2f",Double.parseDouble(myInputAmount.getText().toString())*70.0));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
