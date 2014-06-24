package com.example.eventhandler2;
import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;
import android.os.Bundle;
public class MainActivity extends Activity implements OnClickListener{
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		
		//Register events
		button1.setOnClickListener(this);
		button2.setOnClickListener(this);
	}
	public void onClick(View v);
	{
		if(v.getId() == R.id.button1)
		{
			TextView textView = (TextView) findViewById(R.id.textView1);
			textView.setTextSize(14);
			return;
		}
		if(v.getId() == R.id.button2)
		{
			TextView textView = (TextView) findViewById(R.id.textView1);
			textView.setTextSize(24);
			return;
		}
	}

}
