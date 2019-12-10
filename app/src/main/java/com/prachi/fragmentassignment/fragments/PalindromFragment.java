package com.prachi.fragmentassignment.fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.prachi.fragmentassignment.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PalindromFragment extends Fragment implements View.OnClickListener {

    EditText etnum;
    Button btncheck;
    TextView tvmessage;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_palindrom, container, false);
        etnum = view.findViewById(R.id.etnum);
        tvmessage = view.findViewById(R.id.tvmessage);
        btncheck = view.findViewById(R.id.btncheck);

        btncheck.setOnClickListener(this);
        // Inflate the layout for this fragment
        return view;
    }

    @Override
    public void onClick(View v) {


        int num = Integer.parseInt(etnum.getText().toString());
                int reversedInteger = 0, remainder, originalInteger;
        originalInteger = num;
        // reversed integer is stored in variable
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        if(originalInteger == reversedInteger){
            tvmessage.setText("It is palindrom");
            //Toast.makeText(getActivity(), "is: " + originalInteger, Toast.LENGTH_SHORT).show();
        }
        else{
           tvmessage.setText("It is not a palindrom");
            //Toast.makeText(getActivity(),"is not: " +  originalInteger, Toast.LENGTH_SHORT).show();
        }

    }
}
