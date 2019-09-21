package com.example.android.quakereport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    /** Resource ID for the background color for this list of words */
    //private int mColorResourceId;

    /**
     * Create a new {@link EarthquakeAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Earthquake}s to be displayed.
     *
     */
    public EarthquakeAdapter(Context context, ArrayList<Earthquake> words) {
        super(context, 0, words);
       // mColorResourceId = colorResourceId;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.earthquake_list_item, parent, false);
        }

        Earthquake local_word = getItem(position);



        TextView magnitudeView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeView.setText(local_word.getMagnitude());

        TextView locationView = (TextView) listItemView.findViewById(R.id.location);
        locationView.setText(local_word.getLocation());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(local_word.getDate());



        return listItemView;
    }
}