package com.example.flexibleuiexample;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity implements FragmentA.CommunicatorInterface{

    FragmentA fragmentA;
    FragmentB fragmentB;
    FragmentManager fragmentManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentManager = getFragmentManager();
        fragmentA = (FragmentA) fragmentManager.findFragmentById(R.id.fragment_a);
        fragmentA.setCommunicatorInterface(this);
    }

    @Override
    public void respond(int index){
        fragmentB = (FragmentB) fragmentManager.findFragmentById(R.id.fragment_b);
        if(fragmentB != null && fragmentB.isVisible()) {
            fragmentB.changeData(index);
        }
        else{
            Intent intent = new Intent(this, AnotherActivity.class);
            intent.putExtra("index", index);
            startActivity(intent);
        }


    }



}
