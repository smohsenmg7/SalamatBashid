package com.example.mohsen.salamatbashid;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home,container,false);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(new Card(R.drawable.temp1,R.string.title1,R.string.context1));
        cards.add(new Card(R.drawable.temp2,R.string.title2,R.string.context2));
        cards.add(new Card(R.drawable.temp3,R.string.title3,R.string.context3));
        cards.add(new Card(R.drawable.temp4,R.string.title4,R.string.context4));
        cards.add(new Card(R.drawable.temp1,R.string.title1,R.string.context1));
        cards.add(new Card(R.drawable.temp2,R.string.title2,R.string.context2));
        cards.add(new Card(R.drawable.temp3,R.string.title3,R.string.context3));
        cards.add(new Card(R.drawable.temp4,R.string.title4,R.string.context4));

        RecyclerView mRecyclerView = view.findViewById(R.id.my_recycler_view);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mRecyclerView.setAdapter(new RecyclerAdapter(cards));

        return view;
    }

}
