package com.example.smssample;
import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.View.OnClickListener;
import android.telephony.SmsManager;
public class MainActivity extends Activity {
	
	Button buttonSend;
	EditText editNumber, editMessage;
	
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		buttonSend = (Button) findViewById(R.id.buttonSend);
		editNumber = (EditText) findViewById(R.id.editNumber);
		editMessage = (EditText) findViewById(R.id.editMessage);
		buttonSend.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				sendMessage();
			}
		});
		
		
	}
	public void sendMessage()
	{
		String number, message;
		number = editNumber.getText().toString();
		message = editMessage.getText().toString();
		try{
			SmsManager smsManager = SmsManager.getDefault();
			smsManager.sendTextMessage(number, null, message, null, null);
			Toast.makeText(getApplicationContext(), "SMS sent", Toast.LENGTH_LONG).show();
		} catch(Exception e)
		{
			Toast.makeText(getApplicationContext(), "SMS fail", Toast.LENGTH_LONG).show();
			e.printStackTrace();
		}
	}

}
