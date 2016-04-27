package com.example.franklaptop.myapplication;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Frank Verhagen on 25-4-2016.
 */
public class MainFragment extends Fragment {
    private ViewPager viewPager;
    private TabLayout tabLayout;

    //Mandatory Constructor
    public MainFragment() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main,container, false);


        viewPager = (ViewPager) rootView.findViewById(R.id.viewpager);

        setupViewPager(viewPager);
        tabLayout = (TabLayout) rootView.findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        return rootView;
    }
    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getChildFragmentManager());
        adapter.addFragment(new FragmentB(), "ONE");
        adapter.addFragment(new FragmentC(), "TWO");
        adapter.addFragment(new FragmentD(), "THREE");
        viewPager.setAdapter(adapter);
    }
}