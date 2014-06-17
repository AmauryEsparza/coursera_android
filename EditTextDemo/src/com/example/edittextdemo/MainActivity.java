package com.example.edittextdemo;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		final EditText editTxt = (EditText) findViewById(R.id.edit_text);
		
		Button accept = (Button) findViewById(R.id.button_accept);
		
		accept.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Toast.makeText(getBaseContext(), editTxt.getText().toString(), Toast.LENGTH_LONG).show()	;
			}
		});
		
		
	}

}
