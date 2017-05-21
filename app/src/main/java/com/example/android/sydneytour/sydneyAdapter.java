package com.example.android.sydneytour;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by johan on 24/04/2017.
 */

public class sydneyAdapter extends ArrayAdapter<sydney> {

    private int sColorResourceId;

    /**
     * crate a link  the sydneyAdapeter
     *
     * @param context
     * @param
     */


    public sydneyAdapter(Context context, ArrayList<sydney> places, int colorResourceId) {
        super(context, 0, places);
        sColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View grid_listItemView = convertView;
        if (grid_listItemView == null) {
            grid_listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_list_item, parent, false);
        }

    // get the sydney item position
        sydney sydneyInfo = getItem(position);


        TextView sydneyTextView = (TextView) grid_listItemView.findViewById(R.id.placesName);


        sydneyTextView.setText(sydneyInfo.getSydneyDescriptionId());

        ImageView imageView = (ImageView) grid_listItemView.findViewById(R.id.photo);


        // If an image is available, display the provided image based on the resource ID
        imageView.setImageResource(sydneyInfo.getSydneyFhotosId());



        View textContainer = grid_listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), sColorResourceId);

        textContainer.setBackgroundColor(color);


        return grid_listItemView;
    }
}
