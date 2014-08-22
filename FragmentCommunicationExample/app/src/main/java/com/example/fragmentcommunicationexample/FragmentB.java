package com.example.fragmentcommunicationexample;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.os.Bundle;
/**
 * Created by Amaury Esparza on 22/08/2014.
 */
public class FragmentB extends Fragment{
    TextView textView;
    String data;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_b, container, false);
        if(savedInstanceState != null){
            data = savedInstanceState.getString("text");
            TextView myText = (TextView) view.findViewById(R.id.text_view);
            myText.setText(data);
        }
        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putString("text", data);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        textView = (TextView) getActivity().findViewById(R.id.text_view);
    }

    public void changeText(String data){
        this.data = data;
        textView.setText(data);
    }






}
