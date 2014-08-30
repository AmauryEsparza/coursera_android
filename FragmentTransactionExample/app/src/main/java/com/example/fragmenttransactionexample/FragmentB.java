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
public class FragmentB extends Fragment {
    @Override
    public void onAttach(Activity activity){
        Log.d("FragmentB ", "FragmentB OnAttach");
        super.onAttach(activity);
    }

    @Override
    public void onCreate(Bundle savedInstanceState){
        Log.d("FragmentB ", "FragmentB onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        Log.d("FragmentB ", "FragmentB OnCreateView");
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        Log.d("FragmentB ", "FragmentB OnActivityCreated");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d("FragmentB ", "FragmentB OnPause");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d("FragmentB ", "FragmentB OnStop");
    }
    @Override
    public void onDestroyView(){
        super.onDestroyView();
        Log.d("FragmentB ", "FragmentB OnDestroyView");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d("FragmentB ", "FragmentB OnDestroy");
    }

    @Override
    public void onDetach(){
        super.onDetach();
        Log.d("FragmentB ", "FragmentB OnDetach");
    }
}
