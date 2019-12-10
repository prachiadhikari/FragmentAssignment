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
public class Areafragment extends Fragment implements View.OnClickListener {
    private EditText etradius;
    private Button btncalculate;
    private TextView tvarea;

    public Areafragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_areafragment, container, false);
        etradius=view.findViewById(R.id.etradius);
        btncalculate=view.findViewById(R.id.btncalculate);
        tvarea=view.findViewById(R.id.tvarea);
        btncalculate.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {

        float r;
        r=Float.parseFloat(etradius.getText().toString());
        float area=(22/7)*r*r;
        tvarea.setText("area of circle is:"+area);

    }
}
