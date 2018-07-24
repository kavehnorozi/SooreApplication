package ir.ac.soore.sooreapplication.fragment;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import ir.ac.soore.sooreapplication.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class CollegeAboutFragment extends Fragment {

    private static final String KEY_POSITION = "POSITION";
    String[] Contents;



    public static CollegeAboutFragment newInstance(int position){
        CollegeAboutFragment frg=new CollegeAboutFragment();
        Bundle b= new Bundle();
        b.putInt(KEY_POSITION,position);
        frg.setArguments(b);
        return frg;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view=inflater.inflate(R.layout.fragment_college_about, container, false);
        TextView text=(TextView) view.findViewById(R.id.txt_college_about);
        int position = getArguments().getInt(KEY_POSITION,-1);
        Contents= getResources().getStringArray(R.array.content_university_tabs);
        text.setText(Contents[position]);

        return view;
    }

}
