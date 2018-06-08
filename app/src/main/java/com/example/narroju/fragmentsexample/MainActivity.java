package com.example.narroju.fragmentsexample;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        FragmentB frag = new FragmentB();

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();




        fragmentTransaction.add(R.id.my_layout, frag, "new fragment");
        fragmentTransaction.commit();
    }



}
