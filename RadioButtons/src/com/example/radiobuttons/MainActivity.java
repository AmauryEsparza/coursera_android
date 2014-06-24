package com.example.radiobuttons;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RadioButton;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;
public class MainActivity extends Activity{
	private RadioGroup radioGroupWebsite;
	private RadioButton radioButton1;
	private Button resultButton;
	
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		addListenerRadioButton();
	}
	private void addListenerRadioButton()
	{
		radioGroupWebsite = (RadioGroup) findViewById(R.id.radioGroup1);
		resultButton = (Button) findViewById(R.id.button1);
		
		resultButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				int selected = radioGroupWebsite.getCheckedRadioButtonId();
				radioButton1 = (RadioButton) findViewById(selected);
				Toast.makeText(MainActivity.this, radioButton1.getText(), Toast.LENGTH_LONG).show();
				
			}
		});
		
	}

}
