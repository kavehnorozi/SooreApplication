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
public class UniversityAboutFragment extends Fragment {


    public UniversityAboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_university_about, container, false);



        return view;
    }

}
