package com.example.flexibleuiexample;

import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Amaury Esparza on 25/08/2014.
 */
public class FragmentB extends Fragment {
    TextView textView;
    @Override
    public void onActivityCreated(Bundle savedInstanceState){

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        textView = (TextView) view.findViewById(R.id.textView);
        return view;

    }
    public void changeData(int index){
        String [] descriptions;
        descriptions = getResources().getStringArray(R.array.descriptions);
        textView.setText(descriptions[index]);

    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState){
        super.onSaveInstanceState(savedInstanceState);
    }
}
