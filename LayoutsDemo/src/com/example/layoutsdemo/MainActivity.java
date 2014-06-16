package com.example.layoutsdemo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.app.Activity;
import android.content.Intent;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		final EditText txtName = (EditText) findViewById(R.id.text_name);
		Button buttonOK = (Button) findViewById(R.id.button_layout);
		
		buttonOK.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				
				Intent intent = new Intent(MainActivity.this, SayHello.class);
				
				Bundle b = new Bundle();
				b.putString("NOMBRE", txtName.getText().toString());
				
				intent.putExtras(b);
				
				startActivity(intent);
				
				
				
			}
		});
	}
}
