package com.example.checkbox;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;
public class MainActivity extends Activity{
	
	private CheckBox check1, check2, check3;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addListenerOnCheck1();
		addListenerOnCheck2();
		addListenerOnCheck3();
	}
	
	private void addListenerOnCheck1()
	{
		check1 = (CheckBox) findViewById(R.id.checkBox1);
		check2 = (CheckBox) findViewById(R.id.checkBox2);
		check3 = (CheckBox) findViewById(R.id.checkBox3);
		
		check2.setOnClickListener(new OnClickListener(){
			@Override
			public void onClick(View v)
			{
				StringBuffer result = new StringBuffer();
				result.append("Java Selection: ").append(check1.isChecked());
				result.append("Perl Selection: ").append(check2.isChecked());
				result.append("Python Selection: ").append(check3.isChecked());
				
				Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
			}
		});
	}
	
	//Method for CheckBox2 - Perl
	private void addListenerOnCheck2()
	{
		check1 = (CheckBox) findViewById(R.id.checkBox1);
		check2 = (CheckBox) findViewById(R.id.checkBox2);
		check3 = (CheckBox) findViewById(R.id.checkBox3);
		
		check3.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				StringBuffer result = new StringBuffer();
				result.append("Java Selection: ").append(check1.isChecked());
				result.append("Perl Selection: ").append(check2.isChecked());
				result.append("Python Selection: ").append(check3.isChecked());
				
				Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
			}
		});
	}
	
	private void addListenerOnCheck3()
	{
		check1 = (CheckBox) findViewById(R.id.checkBox1);
		check2 = (CheckBox) findViewById(R.id.checkBox2);
		check3 = (CheckBox) findViewById(R.id.checkBox3);
		
		check1.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				StringBuffer result = new StringBuffer();
				result.append("Java Selection: ").append(check1.isChecked());
				result.append("Perl Selection: ").append(check1.isChecked());
				result.append("Python Selection: ").append(check1.isChecked());
				Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
			}
		});
		
	}
	

}
