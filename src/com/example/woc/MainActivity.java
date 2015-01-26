package com.example.woc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.waves);
        
        Button A = (Button) findViewById(R.id.WaveA);
        Button B = (Button) findViewById(R.id.WaveB);
        Button C = (Button) findViewById(R.id.WaveC);
        Button D = (Button) findViewById(R.id.WaveD);
        
        A.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.a);
				
		        Button button = (Button) findViewById(R.id.aButton);
		        
		        final EditText start = (EditText) findViewById(R.id.aEditText);
				
				final TextView p40 = (TextView) findViewById(R.id.a40);
		        final TextView p50 = (TextView) findViewById(R.id.a50);
		        final TextView p60 = (TextView) findViewById(R.id.a60);
		        final TextView p75 = (TextView) findViewById(R.id.a75);
		        final TextView p80 = (TextView) findViewById(R.id.a80);
		        final TextView p85 = (TextView) findViewById(R.id.a85);
		        
		        button.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						String a;
						
						//for 40
						a = cal(start, 40);
						p40.setText("5 reps of "+a);
						
						//for 50
						a = cal(start, 50);
						p50.setText("5 reps of "+a);
				
						//for 60
						a = cal(start, 60);
						p60.setText("3 reps of "+a);
						
						//for 75
						a = cal(start, 75);
						p75.setText("5 reps of "+a);
						
						//for 80
						a = cal(start, 80);
						p80.setText("5 reps of "+a);
				
						//for 85
						a = cal(start, 85);
						p85.setText("5 or more reps of "+a);
						
			
					}
				});
			}
		});
        
        B.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.b);
				
		        Button button = (Button) findViewById(R.id.bButton);
		        
		        final EditText start = (EditText) findViewById(R.id.bEditText);
				
				final TextView p40 = (TextView) findViewById(R.id.b40);
		        final TextView p50 = (TextView) findViewById(R.id.b50);
		        final TextView p60 = (TextView) findViewById(R.id.b60);
		        final TextView p80 = (TextView) findViewById(R.id.b80);
		        final TextView p85 = (TextView) findViewById(R.id.b85);
		        final TextView p90 = (TextView) findViewById(R.id.b90);
				        
		        button.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						String a;
						
						//for 40
						a = cal(start, 40);
						p40.setText("5 reps of "+a);
						
						//for 50
						a = cal(start, 50);
						p50.setText("5 reps of "+a);
				
						//for 60
						a = cal(start, 60);
						p60.setText("3 reps of "+a);
						
						//for 80
						a = cal(start, 80);
						p80.setText("3 reps of "+a);
						
						//for 85
						a = cal(start, 85);
						p85.setText("3 reps of "+a);
				
						//for 90
						a = cal(start, 90);
						p90.setText("3 or more reps of "+a);
			
					}
				});
			
			}
		});
				
		C.setOnClickListener(new View.OnClickListener() {
					
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.c);
				
		        Button button = (Button) findViewById(R.id.cButton);
		        
		        final EditText start = (EditText) findViewById(R.id.cEditText);
				
				final TextView p40 = (TextView) findViewById(R.id.c40);
		        final TextView p50 = (TextView) findViewById(R.id.c50);
		        final TextView p60 = (TextView) findViewById(R.id.c60);
		        final TextView p75 = (TextView) findViewById(R.id.p75);
		        final TextView p85 = (TextView) findViewById(R.id.p85);
		        final TextView p95 = (TextView) findViewById(R.id.p95);
				
		        button.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						String a;
						
						//for 40
						a = cal(start, 40);
						p40.setText("5 reps of "+a);
						
						//for 50
						a = cal(start, 50);
						p50.setText("5 reps of "+a);
				
						//for 60
						a = cal(start, 60);
						p60.setText("3 reps of "+a);
						
						//for 75
						a = cal(start, 75);
						p75.setText("5 reps of "+a);
						
						//for 85
						a = cal(start, 85);
						p85.setText("3 reps of "+a);
				
						//for 95
						a = cal(start, 95);
						p95.setText("1 or more reps of "+a);
			
					}
				});
			}
		});	

		D.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				setContentView(R.layout.d);
				
		        Button button = (Button) findViewById(R.id.dButton);
		        
		        final EditText start = (EditText) findViewById(R.id.dEditText);
				
				final TextView p40 = (TextView) findViewById(R.id.d40);
		        final TextView p50 = (TextView) findViewById(R.id.d50);
		        final TextView p60 = (TextView) findViewById(R.id.d60);
		        final TextView pp60 = (TextView) findViewById(R.id.dd60);
		        final TextView p65 = (TextView) findViewById(R.id.d65);
		        final TextView p70 = (TextView) findViewById(R.id.d70);
		        
		        button.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View v) {
						// TODO Auto-generated method stub
						String a;
						
						//for 40
						a = cal(start, 40);
						p40.setText("5 reps of "+a);
						
						//for 50
						a = cal(start, 50);
						p50.setText("5 reps of "+a);
				
						//for 60
						a = cal(start, 60);
						p60.setText("3 reps of "+a);
						
						//for dd60
						a = cal(start, 60);
						pp60.setText("5 reps of "+a);
						
						//for 65
						a = cal(start, 65);
						p65.setText("5 reps of "+a);
				
						//for 70
						a = cal(start, 70);
						p70.setText("5 reps of "+a);
						
			
					}
				});
		        
			}
		});
        
    }
    
    public String cal(EditText start , int percent){
    	
    	int temp;
    	double weight;
    	String a;
    	
    	a = start.getText().toString();
		weight = Double.parseDouble(a);
		weight = (weight/100)*percent;
		temp= (int)weight;
		temp = temp/5;
		temp = temp*5;
		a = Integer.toString(temp);
		return a; 
    	
    }


   
}
