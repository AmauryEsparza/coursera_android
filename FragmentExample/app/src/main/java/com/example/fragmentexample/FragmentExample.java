package com.example.fragmentexample;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Amaury Esparza on 21/08/2014.
 */
public class FragmentExample extends Fragment {

    @Override
    public void onAttach(Activity activity){
        Log.d("Fragment", "On Attach");
        super.onAttach(activity);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.d("Fragment", "On Create View");
        return inflater.inflate(R.layout.fragment_example, container, false);
    }



}
