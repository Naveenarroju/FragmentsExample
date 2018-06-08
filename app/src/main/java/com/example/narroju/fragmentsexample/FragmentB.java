package com.example.narroju.fragmentsexample;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentB extends Fragment {

    private  FragmentBListener listener;
    private Button button;

public interface FragmentBListener{
    void onInuputBSent(CharSequence input);
}


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_fragment2, container, false);
        button = v.findViewById(R.id.hello_button);

return v;
}




}
