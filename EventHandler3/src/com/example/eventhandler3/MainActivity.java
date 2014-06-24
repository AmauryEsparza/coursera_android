package com.example.eventhandler3;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity{
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	public void doSmall(View v)
	{
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		textView1.setTextSize(14);
		return;
	}
	public void doLarge(View v)
	{
		TextView textView1 = (TextView) findViewById(R.id.textView1);
		textView1.setTextSize(24);
		return;
	}

}
