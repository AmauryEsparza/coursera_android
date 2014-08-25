package com.example.flexibleuifragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Amaury Esparza on 22/08/2014.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{

    InterfaceCommunicator communicator;
    ListView listView;
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        listView = (ListView) getActivity().findViewById(R.id.listView);
        communicator = (InterfaceCommunicator)getActivity();
        ArrayAdapter adapter = ArrayAdapter.createFromResource(getActivity(), R.array.titles, android.R.layout.simple_list_item_1);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_a, container, false);
    }
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l){
        communicator.respond(i);
    }

}
