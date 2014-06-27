package com.example.dataviewdemo;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class DataView extends TextView{
	public DataView(Context context)
	{
		super(context);
		setDate();
	}
	public DataView(Context context, AttributeSet attrs)
	{
		super(context, attrs);
		setDate();
	}
	public DataView(Context context, AttributeSet attrs, int defStyle)
	{
		super(context, attrs, defStyle);
		setDate();
	}
	public void setDate()
	{
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		String today = dateFormat.format(Calendar.getInstance().getTime());
		setText(today); //self = DataView is a subclass of TextView
	}
}
