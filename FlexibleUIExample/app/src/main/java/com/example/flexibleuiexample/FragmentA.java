package com.example.flexibleuiexample;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created by Amaury Esparza on 25/08/2014.
 */
public class FragmentA extends Fragment implements AdapterView.OnItemClickListener{

    ListView list;
    CommunicatorInterface communicatorInterface;

    public void setCommunicatorInterface(CommunicatorInterface communicatorInterface){
        this.communicatorInterface = communicatorInterface;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_a, container, false);
        list = (ListView) view.findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = ArrayAdapter.createFromResource(getActivity(), R.array.titles, android.R.layout.simple_list_item_1);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(this);
        return view;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        communicatorInterface.respond(position);
    }

    public interface CommunicatorInterface{
        public void respond(int index);
    }
}
