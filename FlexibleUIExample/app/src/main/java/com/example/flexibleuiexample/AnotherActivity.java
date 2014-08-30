package com.example.flexibleuiexample;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by Amaury Esparza on 28/08/2014.
 */
public class AnotherActivity extends Activity {

    FragmentB fragmentB;
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);
        //Receive the index value from FragmentB
        int index = savedInstanceState.getInt("index");
        Log.d("index in AnotherActivity", " " + index);
        fragmentB = (FragmentB) getFragmentManager().findFragmentById(R.id.fragment2);
        fragmentB.changeData(index);
    }
}
