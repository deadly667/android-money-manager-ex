package com.money.manager.ex.tutorial;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.money.manager.ex.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TutorialPageCurrencies extends Fragment {


    public TutorialPageCurrencies() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tutorial_page_currencies, container, false);
    }

}
