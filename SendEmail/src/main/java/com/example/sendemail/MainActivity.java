package com.example.sendemail;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.View;
import android.widget.Toast;

/**
 * Created by Amaury Esparza on 18/07/2014.
 */
public class MainActivity extends Activity{
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonSend = (Button) findViewById(R.id.button_send);
        buttonSend.setOnClickListener(new OnClickListener()
        {
            public void onClick(View v)
            {
                sendEmail();
            }
        });
    }

    public void sendEmail()
    {
        String[] TO = {"juan.perez@gmail.com"};
        String[] CC = {"developer.android@gmail.com"};
        //Intent to send the email
        Intent emailIntent = new Intent(Intent.ACTION_SEND);
        emailIntent.setDataAndType(Uri.parse("mailto:"), "text/plain");
        //Put the intent's extras
        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
        emailIntent.putExtra(Intent.EXTRA_CC, CC);
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "The subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "The Message HERE!!");
        try{
            startActivity(Intent.createChooser(emailIntent, "Send email..."));
            finish();
            Log.i("Finished Send Email...", "");
        }catch(ActivityNotFoundException ex)
        {
            Toast.makeText(MainActivity.this, "There is not mail client installed", Toast.LENGTH_LONG).show();
        }


    }
}
