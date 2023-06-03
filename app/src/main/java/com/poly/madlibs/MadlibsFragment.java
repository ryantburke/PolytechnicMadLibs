package com.poly.madlibs;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MadlibsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MadlibsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String MADLIBS = "Madlibs";


    private Context context;
    private ArrayList<MadLibsModel> madLibs;
    private MadLibsAdapter madLibsAdapter;
    private RecyclerView recyclerView;

    private ListView listView;

    public MadlibsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MadlibsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static MadlibsFragment newInstance(ArrayList<MadLibsModel> madlibs) {
        MadlibsFragment fragment = new MadlibsFragment();
        Bundle args = new Bundle();
        args.putSerializable(MADLIBS,madlibs);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            madLibs = (ArrayList<MadLibsModel>) getArguments().getSerializable(MADLIBS);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //create MadLibs list
        madLibs = new ArrayList<MadLibsModel>();


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_madlibs,container,false);
        recyclerView = view.findViewById(R.id.mRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new
                LinearLayoutManager(view.getContext()));
        recyclerView.setAdapter(new MadLibs_RecyclerViewAdapter(context,madLibs));
        return view;
    }


}