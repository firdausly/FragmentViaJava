package com.example.fragmentviajava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentRabbit extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
// Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_rabbit, container, false);
        TextView TVRabbit= (TextView)view.findViewById(R.id.TVRabbit);
        TVRabbit.setText("Rabbit");
        return view;
    }
}