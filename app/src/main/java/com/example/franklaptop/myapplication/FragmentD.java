package com.example.franklaptop.myapplication;

/**
 * Created by Frank Verhagen on 25-4-2016.
 */
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentD extends Fragment{
    //Mandatory Constructor
    public FragmentD() {
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_d,container, false);


        return rootView;
    }
}
