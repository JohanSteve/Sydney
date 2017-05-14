package com.example.android.sydneytour;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
*/
public class sydTourCity_fragment extends Fragment {


    public sydTourCity_fragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.syd_list_item, container, false);


        //list of places
        final ArrayList<sydney> places = new ArrayList<sydney>();
        places.add(new sydney(R.string.Hyde_Park, R.drawable.hyde_park));
        places.add(new sydney(R.string.Bondi_Beach, R.drawable.bondi_beach));
        places.add(new sydney(R.string.Opera_house, R.drawable.opera_house));

        sydneyAdapter adapter = new sydneyAdapter(getActivity(), places, R.color.tab_selector);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);



        return rootView;

    }
}