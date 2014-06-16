package com.example.intentdemo3;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button buttonExplorer = (Button) findViewById(R.id.button_explorer);
		Button buttonCall = (Button) findViewById(R.id.button_phone);
		Button buttonMaps = (Button) findViewById(R.id.button_maps);
		Button buttonCamera = (Button) findViewById(R.id.button_camera);
		Button buttonEmail = (Button) findViewById(R.id.button_email);
		
		buttonExplorer.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.luisflores.mx"));
				startActivity(intent);
			}
			
		});
		
		buttonCall.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent(Intent.ACTION_CALL, Uri.parse("tel:9875123731"));
				startActivity(intent);
			}
		});
		
		buttonMaps.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:41.656313,-0.877351"));
				startActivity(intent);
			}
		});
		
		buttonCamera.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
				startActivity(intent);
			}
		});
		buttonEmail.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent(Intent.ACTION_SEND);
				intent.setType("text/plain");
				intent.putExtra(Intent.EXTRA_SUBJECT, "asunto");
				intent.putExtra(Intent.EXTRA_TEXT, "texto del correo");
				intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"amauryesparza@gmail.com"});
				startActivity(intent);
			}
		});
		
	}
}
