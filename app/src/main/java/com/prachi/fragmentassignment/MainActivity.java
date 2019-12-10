package com.prachi.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.prachi.fragmentassignment.fragments.Areafragment;
import com.prachi.fragmentassignment.fragments.ArmstrongFragment;
import com.prachi.fragmentassignment.fragments.AutomorphicFragment;
import com.prachi.fragmentassignment.fragments.PalindromFragment;
import com.prachi.fragmentassignment.fragments.SIFragment;
import com.prachi.fragmentassignment.fragments.SwappingFragment;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 private Button btnPalindrom,btnArea,btnAutomorphic,btnSI,btnArmstrong,btnSwapNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArea=findViewById(R.id.btnArea);
        btnArea.setOnClickListener(this);

        btnArmstrong=findViewById(R.id.btnArmstrong);
        btnArmstrong.setOnClickListener(this);

        btnAutomorphic=findViewById(R.id.btnAutomorphic);
        btnAutomorphic.setOnClickListener(this);

        btnSI=findViewById(R.id.btnSI);
        btnSI.setOnClickListener(this);

        btnPalindrom=findViewById(R.id.btnPalindrom);
        btnPalindrom.setOnClickListener(this);

        btnSwapNo=findViewById(R.id.btnSwapNo);
        btnSwapNo.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager=getSupportFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();

        switch (v.getId())
        {
            case R.id.btnArea:
                Areafragment areafragment=new Areafragment();

                fragmentTransaction.replace(R.id.fragmentContainer,areafragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnArmstrong:
                ArmstrongFragment armstrongFragment=new ArmstrongFragment();

                fragmentTransaction.replace(R.id.fragmentContainer,armstrongFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrom:
                PalindromFragment palindromFragment=new PalindromFragment();

                fragmentTransaction.replace(R.id.fragmentContainer,palindromFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnSI:
                SIFragment siFragment=new SIFragment();

                fragmentTransaction.replace(R.id.fragmentContainer,siFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnAutomorphic:
                AutomorphicFragment automorphicFragment=new AutomorphicFragment();

                fragmentTransaction.replace(R.id.fragmentContainer,automorphicFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;

            case R.id.btnSwapNo:
                SwappingFragment swappingFragment=new SwappingFragment();

                fragmentTransaction.replace(R.id.fragmentContainer,swappingFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;


        }

    }
}
