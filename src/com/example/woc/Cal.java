package com.example.woc;

import android.widget.TextView;

public class Cal extends MainActivity{
	
	String wave;
	int weight;
	
	public Cal(String wave, int weight){
		this.wave = wave;
		this.weight = weight;
	}

	
	
	public void warmup(){
		
		
		final TextView p40 = (TextView) findViewById(R.id.p40);
		/*
		int weight40;
		
		//for 40
		weight40 = (weight/100) * 40;
		weight40 = (weight/5) * 5;
		*/
		//p40.setText("40% is ");
		
	}
	
}
