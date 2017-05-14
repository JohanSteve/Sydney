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
     * crate a link to conne01240ct the sydneyAdapeter
     *
     * @param context
     * @param
     */


    public sydneyAdapter(Context context, ArrayList<sydney> words, int colorResourceId) {
        super(context, 0, words);
        sColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        sydney sydneyInfo = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView sydneyTextView = (TextView) listItemView.findViewById(R.id.placesName);
        // Get the  translation from the currentWord object and set this text on
        // the Miwok TextView.
        sydneyTextView.setText(sydneyInfo.getSydneyDescriptionId());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.photo);
        // Check if an image is provided for this word or not
        if (sydneyInfo.hasImage()) {
            // If an image is available, display the provided image based on the resource ID
            imageView.setImageResource(sydneyInfo.getSydneyFhotosId());
            // Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        }

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), sColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
