package com.example.intentdemo2;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class MainActivity extends Activity
{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button startBrowser_a = (Button) findViewById(R.id.start_browser1);
		Button startBrowser_b = (Button) findViewById(R.id.start_browser2);
		Button startBrowser_c = (Button) findViewById(R.id.start_browser3);
		
		//First Intent using ACTION_VIEW
		startBrowser_a.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://www.example.com"));
				startActivity(i);
			}
		});
		
		//Second Intent using LAUNCH
		startBrowser_b.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Intent i = new Intent("com.example.intentdemo2.LAUNCH", Uri.parse("http://www.example.com"));
				startActivity(i);
			}
		});
		
		//Third Intent using wrong data
		startBrowser_c.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				Intent i = new Intent("com.example.intentdemo2.LAUNCH", Uri.parse("https://www.example.com"));
				startActivity(i);
			}
		});
		
	}

}
