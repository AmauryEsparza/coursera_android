package com.example.fragmentexample;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        FragmentExample fragmentExample = new FragmentExample();
        fragmentTransaction.add(R.id.activity_layout, fragmentExample, "FragmentExample");
        fragmentTransaction.commit();
    }
}
