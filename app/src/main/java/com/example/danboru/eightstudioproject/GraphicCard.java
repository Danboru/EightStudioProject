package com.example.danboru.eightstudioproject;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.androidhive.slidingmenu.R;

public class GraphicCard extends Fragment {
	
	public GraphicCard(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_grapichcard, container, false);
         
        return rootView;
    }
}
