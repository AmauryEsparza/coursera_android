package com.example.fragmentcommunicationexample;
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Amaury Esparza on 22/08/2014.
 */
public class FragmentA extends Fragment {
    Button button;
    CommunicatorInterface communicator;
    int counter;

    //When the Fragment layout was created
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if(savedInstanceState == null){
            counter = 0;
        }else{
            counter = savedInstanceState.getInt("counter", 0);
        }
    }

    //When the MainActivity layout was created
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_a, container, false);
    }

    //Before destroy the fragment
    @Override
    public void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        outState.putInt("counter", counter);
    }

    //When the Fragment layout become visible in MainActivity
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        communicator = (CommunicatorInterface) getActivity();
        button = (Button) getActivity().findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                communicator.respond("The button was clicked "+ counter + " times");

            }
        });
    }


}
