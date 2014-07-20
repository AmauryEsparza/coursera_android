package com.example.callssample;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
public class MainActivity extends Activity {
	
	Button buttonCall;
	EditText editNumber;
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		buttonCall = (Button) findViewById(R.id.buttonCall);
		editNumber = (EditText) findViewById(R.id.editNumber);
		buttonCall.setOnClickListener(new OnClickListener(){
			public void onClick(View v)
			{
				startCall();
			}
		});
		
		
	}
	public void startCall()
	{
		Log.d("Starting Call", "");
		Intent intentCall = new Intent(Intent.ACTION_CALL);
		intentCall.setData(Uri.parse("tel:"+editNumber.getText().toString()));
		try{
			startActivity(intentCall);
			finish();
		}catch(android.content.ActivityNotFoundException e)
		{
			Toast.makeText(getApplicationContext(), "Imposible to call", Toast.LENGTH_LONG).show();
			e.printStackTrace();
		}
	}

}
