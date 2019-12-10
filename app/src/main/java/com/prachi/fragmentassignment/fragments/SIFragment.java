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
public class SIFragment extends Fragment implements View.OnClickListener
{
    private EditText etPrinciple,etTime,etRate;
    private Button btnSI;
    private TextView tvSI;


    public SIFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_si, container, false);
        etPrinciple=view.findViewById(R.id.etPrinciple);
        etRate=view.findViewById(R.id.etRate);
        etTime=view.findViewById(R.id.etTime);
        tvSI=view.findViewById(R.id.tvSI);

        btnSI=view.findViewById(R.id.btnSI);
        btnSI.setOnClickListener(this);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {

        float P,T,R;
        P=Float.parseFloat(etPrinciple.getText().toString());
        T=Float.parseFloat(etTime.getText().toString());
        R=Float.parseFloat(etRate.getText().toString());

        float SI=(P*T*R)/100;
        tvSI.setText("Simple Interest is:"+SI);

    }
}
