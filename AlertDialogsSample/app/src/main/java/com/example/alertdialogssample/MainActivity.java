package com.example.alertdialogssample;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;






/**
 * Created by Amaury Esparza on 21/07/2014.
 */
public class MainActivity extends Activity{

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open(View view)
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage(R.string.decision);
        alertDialogBuilder.setPositiveButton(R.string.positive_button, new DialogInterface.OnClickListener()
        {
           @Override
            public void onClick(DialogInterface arg0, int arg1)
            {
                Intent positiveActivity = new Intent(getApplicationContext(), PositiveActivity.class);
                startActivity(positiveActivity);
            }

        });

        alertDialogBuilder.setNegativeButton(R.string.negative_button, new DialogInterface.OnClickListener()
        {
            @Override
            public void onClick(DialogInterface dialog, int wich)
            {
                Intent negativeActivity = new Intent(getApplicationContext(), NegativeActivity.class);
                startActivity(negativeActivity);
            }
        });

        AlertDialog alertDialog = new alertDialogBuilder.create();
        alertDialog.show();
    }

}
