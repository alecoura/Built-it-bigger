package com.nanodegree.jokesandroidlib;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class JokesActivityFragment extends Fragment {

    // Empty constructor
    public JokesActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_jokes_fragment, container, false);
        TextView jokesTextView = view.findViewById(R.id.tv_jokes);

        Intent intent = getActivity().getIntent();
        String joke = intent.getStringExtra("jokes");
        jokesTextView.setText(joke);

        /*
        String joke = i.getStringExtra("jokes");


        textView.setText(joke);


        String gce_result = getActivity().getIntent().getStringExtra("gce_result");
        TextView gce_result_show = (TextView) v.findViewById(R.id.tv_jokes);
        gce_result_show.setText(gce_result);
                */

        return view;
    }

}