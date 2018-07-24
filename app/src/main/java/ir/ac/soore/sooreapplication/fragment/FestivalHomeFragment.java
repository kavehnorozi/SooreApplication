package ir.ac.soore.sooreapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ir.ac.soore.sooreapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class FestivalHomeFragment extends Fragment {


    public FestivalHomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_festival_home, container, false);
    }

}
