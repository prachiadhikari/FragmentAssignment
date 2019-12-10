package com.prachi.fragmentassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.prachi.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SwappingFragment extends Fragment implements View.OnClickListener{
    private EditText etFirst,etSecond;
    private Button btnSwap;
    private TextView tvSwap;


    public SwappingFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_swapping, container, false);
        etFirst=view.findViewById(R.id.etFirst);
        etSecond=view.findViewById(R.id.etSecond);
        tvSwap=view.findViewById(R.id.tvSwap);

        btnSwap=view.findViewById(R.id.btnSwap);
        btnSwap.setOnClickListener(this);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {
        int first,second;
        first=Integer.parseInt(etFirst.getText().toString());
        second=Integer.parseInt(etSecond.getText().toString());
        first=first+second;
        second=first-second;
        first=first-second;

        tvSwap.setText("After swapping: first no="+first +"  second no=" + second);

    }
}
