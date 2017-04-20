package com.example.android.sydneytour;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;


import java.util.ArrayList;
import java.util.List;



public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private Toolbar toolbar;
    private TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        // Find the view pager that will allow the user to swipe between fragments
        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);
    }

        private void setupViewPager(ViewPager viewPager) {
            ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
            adapter.addFragment(new sydTourCity_fragment(),"Sydney tour ");
            adapter.addFragment(new sydRestCity_fragment(),"Sydney Restaurants");
            viewPager.setAdapter(adapter);

    }
class  ViewPagerAdapter extends FragmentPagerAdapter{
        private final List<Fragment>sydFragmentList = new ArrayList<>();
    private  final List<String>sydFragmentTitleList =new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager) {super(manager);}
    @Override
    public Fragment getItem(int position) {
        return sydFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return sydFragmentList.size();
    }

    public void addFragment(Fragment fragment, String title) {
        sydFragmentList.add(fragment);
        sydFragmentTitleList.add(title);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return sydFragmentTitleList.get(position);
    }
}
}




