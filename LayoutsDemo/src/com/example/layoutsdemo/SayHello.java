package com.example.layoutsdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class SayHello extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.say_hello);
		
		TextView txtHello = (TextView) findViewById(R.id.text_hello);
		//Information from the intent
		Bundle bundle = this.getIntent().getExtras();
		
		//Buil the message to show
		txtHello.setText("Hello, " + bundle.getString("NOMBRE"));
		
		
	}

}
