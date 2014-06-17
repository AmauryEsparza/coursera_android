package com.example.autocompletetextviewdemo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.AutoCompleteTextView;

public class MainActivity extends Activity {
	
	String[] arr = {"MS SQL Server", "MySQL", "Oracle"};
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	
		AutoCompleteTextView autoText = (AutoCompleteTextView) findViewById(R.id.autocomplete_text);
		ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.select_dialog_item, arr);
		autoText.setThreshold(1);
		autoText.setAdapter(adapter);
	}
}
