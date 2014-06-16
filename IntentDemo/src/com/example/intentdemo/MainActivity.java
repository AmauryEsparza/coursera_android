package com.example.intentdemo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;


public class MainActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button startBrowser = (Button) findViewById(R.id.start_browser);
		startBrowser.setOnClickListener(new View.OnClickListener(){
			public void onClick(View view)
			{
				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.example.com"));
				startActivity(i);
			}
		});
		
		Button startPhone = (Button) findViewById(R.id.start_phone);
		startPhone.setOnClickListener(new View.OnClickListener(){
			public void onClick(View vista)
			{
				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:9519300000"));
				startActivity(i);
			}
		});
	}
	
	/*@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		//Inflate the menu; ths adds items to the action
		//bar if it is present
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.layout.activity_main,menu);
		return true;
	}*/

}
