package com.example.fragmenttransactionexample;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

    FragmentManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        manager = getFragmentManager();
    }
    public void addA(View v){
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.group, fragmentA, "FragmentA");
        transaction.commit();
    }
    public void addB(View v){
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.group, fragmentB, "FragmentB");
        transaction.commit();
    }
    public void removeA(View v){
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("FragmentA");
        if(fragmentA != null) {
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentA);
            transaction.commit();
        }
        else{
            Toast.makeText(getApplicationContext(), "The Activity A Cannot be removed, because not exist", Toast.LENGTH_LONG).show();
        }
    }
    public void removeB(View v){
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag("FragmentB");
        if(fragmentB != null){
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.remove(fragmentB);
            transaction.commit();
        }
        else{
            Toast.makeText(getApplicationContext(), "The Activity B cannot be removed, because not exist", Toast.LENGTH_LONG).show();
        }
    }

    public void onAttach(View v){
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("FragmentA");
        if(fragmentA != null){
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.attach(fragmentA);
            transaction.commit();
        }
    }
    public void onDetach(View v){
        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag("FragmentA");
        if(fragmentA != null){
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.detach(fragmentA);
            transaction.commit();
        }
    }

}
