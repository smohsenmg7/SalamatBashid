package com.example.mohsen.salamatbashid;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.QuickContactBadge;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class CheckUpFragment extends Fragment {

    ImageView imageView;

    public CheckUpFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_check_up, container, false);

        imageView=(ImageView) view.findViewById(R.id.imageView);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity().getApplicationContext(), WeightCheckupActivity.class));
            }
        });
        return view;

    }

}
