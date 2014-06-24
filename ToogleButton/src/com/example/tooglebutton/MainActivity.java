package com.example.tooglebutton;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import android.widget.ToggleButton;
import android.widget.Button;
public class MainActivity extends Activity {
	
	private ToggleButton toggleButton1, toggleButton2;
	private Button buttonResult;
	@Override
	public void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		addListenerOnToggleButton();
	}
	
	private void addListenerOnToggleButton()
	{
		toggleButton1 = (ToggleButton) findViewById(R.id.toggleButton1);
		toggleButton2 = (ToggleButton) findViewById(R.id.toggleButton2);
		buttonResult = (Button) findViewById(R.id.button1);
		
		buttonResult.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				StringBuffer result = new StringBuffer();
				result.append("START Condition -").append(toggleButton1.getText());
				result.append("\nSTOP Condition -").append(toggleButton2.getText());
				Toast.makeText(MainActivity.this, result.toString(), Toast.LENGTH_LONG).show();
			}
		});
		
		
	}

}
