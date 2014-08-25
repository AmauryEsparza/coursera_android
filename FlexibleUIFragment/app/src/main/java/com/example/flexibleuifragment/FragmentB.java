package com.example.flexibleuifragment;
import android.app.Fragment;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Amaury Esparza on 22/08/2014.
 */
public class FragmentB extends Fragment {

    int i;
    TextView textView;
    Resources resource;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.textView);
        resource = getResources();
        if(savedInstanceState != null){
            i = savedInstanceState.getInt("index");
            String descriptions[] = resource.getStringArray(R.array.descriptions);
            textView.setText(descriptions[i]);
        }
    }

    public void changeData(int i){
        this.i = i;
        resource = getResources();
        String descriptions[] = resource.getStringArray(R.array.descriptions);
        textView.setText(descriptions[i]);
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("index", i);
    }
}
