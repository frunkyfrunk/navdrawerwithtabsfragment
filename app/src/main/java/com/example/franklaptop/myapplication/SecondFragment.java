package com.example.franklaptop.myapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Frank Verhagen on 25-4-2016.
 */
public class SecondFragment  extends Fragment {
    private FragmentTabHost mTabHost;

    //Mandatory Constructor
    public SecondFragment() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_second,container, false);


        return rootView;
    }
}