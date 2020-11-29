package com.example.fragmentviajava;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class FragmentPenguin extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_penguin, container, false);
        TextView TVPenguin= (TextView)view.findViewById(R.id.TVPenguin);
        TVPenguin.setText("Penguin");
        return view;
    }
}