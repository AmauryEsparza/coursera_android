package com.example.notificationsexample;

import android.os.Build;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;
import android.support.v4.app.NotificationCompat.Builder;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
public class MainActivity extends Activity{
	private NotificationManager mNotificationManager;
	private int notificationID = 100;
	private int numMessages = 0;
	
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		Button startButton = (Button) findViewById(R.id.buttonStart);
		startButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				displayNotification();
			}
		});
		
		Button cancelButton = (Button) findViewById(R.id.buttonStop);
		cancelButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				cancelNotification();
			}
		});
		
		Button updateButton = (Button) findViewById(R.id.buttonUpdate);
		updateButton.setOnClickListener(new OnClickListener()
		{
			public void onClick(View v)
			{
				updateNotification();
			}
		});
	}
	@TargetApi(Build.VERSION_CODES.JELLY_BEAN)
	protected void displayNotification()
	{
		Log.d("Start", "notificaction");
		/* Invoking the default notification service*/
		NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
		mBuilder.setContentTitle("New Message");
		mBuilder.setContentText("You've received new message.");
		mBuilder.setTicker("New Message Alert");
		mBuilder.setSmallIcon(R.drawable.ic_launcher);
		
		/*Increase notification number every time a new notification arrives */
		mBuilder.setNumber(++numMessages);
		
		/*Creates an explicit intent for an Activity in your app*/
		Intent resultIntent = new Intent(this, NotificationView.class);
		
		TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
		stackBuilder.addParentStack(NotificationView.class);
		
		/* Adds the Intent that start the Activity to the top of the stack */
		stackBuilder.addNextIntent(resultIntent);
		PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0,PendingIntent.FLAG_UPDATE_CURRENT);
		
		mBuilder.setContentIntent(resultPendingIntent);
		
		mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		
		/* notificationID allows you to update the notification later on */
		mNotificationManager.notify(notificationID, mBuilder.build());
	}
	
	protected void cancelNotification()
	{
		Log.i("Cancel", "notification");
		mNotificationManager.cancel(notificationID);
	}
	
	protected void updateNotification()
	{
		Log.i("Update","notification");
		/* Invoking the default notification service */
		NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(this);
		mBuilder.setContentTitle("Update Message");
		mBuilder.setContentText("You've got Updated message");
		mBuilder.setTicker("Update Message Alert");
		mBuilder.setSmallIcon(R.drawable.ic_launcher);
		
		/* Increase notification number every time a new notification arrive */
		mBuilder.setNumber(++numMessages);
		
		/* Creates an explicit intent for an Activity in your app*/
		Intent resultIntent = new Intent(this, NotificationView.class);
		
		TaskStackBuilder stackBuilder = TaskStackBuilder.create(this);
		stackBuilder.addParentStack(NotificationView.class);
		
		/*Adds the intent that starts the Activity to the top of the stack */
		 stackBuilder.addNextIntent(resultIntent);
		 PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(0, PendingIntent.FLAG_UPDATE_CURRENT);
		 
		 mBuilder.setContentIntent(resultPendingIntent);
		 mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
		 
		 /*Update the existing notification using same notification ID */
		 
		 mNotificationManager.notify(notificationID, mBuilder.build());
		 
	}

}
