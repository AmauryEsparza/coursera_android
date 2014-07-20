package com.example.smssample2;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.view.View;
public class MainActivity extends Activity{
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button buttonSMS = (Button) findViewById(R.id.sendSMS);
		buttonSMS.setOnClickListener( new OnClickListener(){
			public void onClick(View v)
			{
				sendSMS();
			}
		});
		
	}
	
	public void sendSMS()
	{
		Intent smsIntent = new Intent(Intent.ACTION_VIEW);
		smsIntent.setData(Uri.parse("smsto:"));
		smsIntent.setType("vnd.android-dir/mms-sms");
		
		smsIntent.putExtra("address", new String("123456789"));
		smsIntent.putExtra("sms_body", "Send from my android application");
		try{
			startActivity(smsIntent);
			finish();
		}catch(android.content.ActivityNotFoundException e)
		{
			Toast.makeText(getApplicationContext(), "SMS fail", Toast.LENGTH_LONG).show();
		}
	}

}
