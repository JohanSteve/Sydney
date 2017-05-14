package com.example.android.sydneytour;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by johan on 22/04/2017.
 */

public class sydCategoryAdapter extends FragmentPagerAdapter {

    private Context sContext;

    public sydCategoryAdapter(Context context, FragmentManager fm) {
        super(fm);
        sContext = context;


    }


    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new sydRestCity_fragment();

        } else
            return new sydTourCity_fragment();


    }

    @Override
    public int getCount() {
        return 2;
    }


    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return "Sydney Restaurants";
        } else
            return "SydneyTour Fragment";

    }
}
