package com.example.danboru.eightstudioproject;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import info.androidhive.slidingmenu.R;

public class Monitor extends Fragment {
	
	public Monitor(){}
	
	@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
 
        View rootView = inflater.inflate(R.layout.fragment_monitor, container, false);
         
        return rootView;
    }
}
