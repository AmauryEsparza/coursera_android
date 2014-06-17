package com.example.textviewexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		TextView txtView = (TextView) findViewById(R.id.txt_view);
		final String label = txtView.getText().toString();
		
		txtView.setOnClickListener(new View.OnClickListener()
		{
			public void onClick(View v)
			{
				Toast.makeText(getApplicationContext(),"You have clicked the Label: "+label, Toast.LENGTH_LONG).show();
			}
		});
		
	}

}
