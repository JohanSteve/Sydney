package com.example.android.sydneytour;


import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.L;
/**
 * A simple {@link Fragment} subclass.
*/
public class sydTourCity_fragment extends Fragment {

    public sydTourCity_fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.syd_grid_list, null);

        //list of places
        final ArrayList<sydney> places = new ArrayList<sydney>();
        places.add(new sydney(R.drawable.hyde_park,R.string.Hyde_Park,R.string.descriptionHyde));
        places.add(new sydney(R.drawable.bondi_beach,R.string.Bondi_Beach,R.string.Bondi_Beach));
        places.add(new sydney(R.drawable.opera_house,R.string.Opera_house,R.string.descriptionOpera));
        places.add(new sydney(R.drawable.royal_botanic_gardens,R.string.Darling_harbour,R.string.descriptionHarbour));

        sydneyAdapter adapter = new sydneyAdapter(getActivity(), places, R.color.tab_selector);

        GridView gridView = (GridView) rootView.findViewById(R.id.syd_Gridview);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {






                }

        });
        return rootView;
    }



    }
