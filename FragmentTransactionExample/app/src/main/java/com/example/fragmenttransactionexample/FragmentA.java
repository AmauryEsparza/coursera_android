package com.example.fragmenttransactionexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Amaury Esparza on 30/08/2014.
 */
public class FragmentA extends Fragment {

    @Override
    public void onAttach(Activity activity){
        Log.d("FragmentA ", "Fragment A OnAttach");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        Log.d("FragmentA ", "Fragment A onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        Log.d("FragmentA ", "Fragment A OnCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Log.d("FragmentA ", "Fragment A OnActivityCreated");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("FragmentA ", "Fragment A OnPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("FragmentA ", "Fragment A OnStop");
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d("FragmentA ", "Fragment A OnDestroyView");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("FragmentA ", "Fragment A OnDestroy");
    }

    @Override
    public void onDetach(){
        super.onDetach();
        Log.d("FragmentA ", "Fragment A OnDetach");
    }




}
