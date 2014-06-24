package com.example.radiogroup;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends Activity{
	
	private RadioGroup radioGroupUser, radioGroupDB;
	private RadioButton radioButtonName, radioButtonDB;
	private Button button1, button2;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//Group1
		addRadioGroupListener1();
		//Group2
		addRadioGroupListener2();
	}
	
	private void addRadioGroupListener1()
	{
		radioGroupUser = (RadioGroup) findViewById(R.id.radioGroup1);
		button1 = (Button) findViewById(R.id.button1);
		
		button1.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				int selected1 = radioGroupUser.getCheckedRadioButtonId();
				radioButtonName = (RadioButton) findViewById(selected1);
				Toast.makeText(MainActivity.this, radioButtonName.getText(), Toast.LENGTH_LONG).show();
			}
			
		});
		
	}
	private void addRadioGroupListener2()
	{
		radioGroupDB = (RadioGroup) findViewById(R.id.radioGroup2);
		button2 = (Button) findViewById(R.id.button2);
		
		button2.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				int selected2 = radioGroupDB.getCheckedRadioButtonId();
				radioButtonDB = (RadioButton) findViewById(selected2);
				Toast.makeText(MainActivity.this, radioButtonDB.getText(), Toast.LENGTH_LONG).show();
			}
		});
	}

}
