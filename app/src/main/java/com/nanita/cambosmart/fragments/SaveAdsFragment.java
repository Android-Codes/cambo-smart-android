package com.nanita.cambosmart.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.nanita.cambosmart.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SaveAdsFragment extends Fragment {


    public SaveAdsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_save_ads, container, false);
    }

}
