package com.example.eventhandler1;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		
		// Register click event with first button
		button1.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v)
			{
				TextView textView = (TextView) findViewById(R.id.textView1);
				textView.setTextSize(14); 
			}
		});
		
		button2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v)
			{
				TextView textView = (TextView) findViewById(R.id.textView1);
				textView.setTextSize(24);
			}
		});
		
	}

	
}
