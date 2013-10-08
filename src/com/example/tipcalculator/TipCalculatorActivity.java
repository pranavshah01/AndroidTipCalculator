package com.example.tipcalculator;

import java.text.DecimalFormat;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TipCalculatorActivity extends Activity {
	private EditText etTotalAmount;
	private TextView tvTipAmount;
	double totalAmount;
	double result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tip_calculator);
        etTotalAmount = (EditText) findViewById(R.id.etAmount);  
        tvTipAmount = (TextView) findViewById(R.id.tvTip);
    }

    public double roundTwoDecimals(double d) {
        DecimalFormat twoDForm = new DecimalFormat("#.##");
        return Double.valueOf(twoDForm.format(d));
    }
    
    public void calc_10tip(View v) {

    	if (etTotalAmount.getText().toString().trim().matches("")) {
    		etTotalAmount.setText("0.0");
    		tvTipAmount.setText("Tip is: 0.0");
    	    return;
    	}    
    	totalAmount = Double.parseDouble(etTotalAmount.getText().toString().trim());
        result = roundTwoDecimals(totalAmount * 10 / 100);     	
    	tvTipAmount.setText("Tip is: "+result);
    }
    
    public void calc_15tip(View v) {   	
    	if (etTotalAmount.getText().toString().trim().matches("")) {
    		etTotalAmount.setText("0.0");
    		tvTipAmount.setText("Tip is: 0.0");
    	    return;
    	} 
    	totalAmount = Double.parseDouble(etTotalAmount.getText().toString().trim());
    	result = roundTwoDecimals(totalAmount * 15 / 100);  	
    	tvTipAmount.setText("Tip is: "+result);
    }
    
    public void calc_20tip(View v) { 	
    	if (etTotalAmount.getText().toString().trim().matches("")) {
    		etTotalAmount.setText("0.0");
    		tvTipAmount.setText("Tip is: 0.0");
    	    return;
    	} 
    	totalAmount = Double.parseDouble(etTotalAmount.getText().toString().trim());
    	result = roundTwoDecimals(totalAmount * 20 / 100); 
    	tvTipAmount.setText("Tip is: "+result);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.tip_calculator, menu);
        return true;
    }
    
}
