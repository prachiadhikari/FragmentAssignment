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
public class AutomorphicFragment extends Fragment implements View.OnClickListener {

    private EditText etnum;
    private TextView tvautomorphic;
    private Button btncheck;

    public AutomorphicFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view =inflater.inflate(R.layout.fragment_automorphic,container,false);
        etnum=view.findViewById(R.id.etnum);
        btncheck=view.findViewById(R.id.btncheck);
        tvautomorphic=view.findViewById(R.id.tvautomorphic);
        btncheck.setOnClickListener(this);

        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {

        int a,square,counter=1;
        int n=Integer.parseInt(etnum.getText().toString());

        a=n;
        square=n*n;
        while (n!=0)
        {
            counter=counter*10;
            n=n/10;
        }
        if(square%counter==a){

            tvautomorphic.setText("it is automorphic");

        }
        else{
            tvautomorphic.setText("it is not automorphic");
        }

    }
}
