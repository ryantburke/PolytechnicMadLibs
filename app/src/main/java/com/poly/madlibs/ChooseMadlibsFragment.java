package com.poly.madlibs;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ChooseMadlibsFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ChooseMadlibsFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String MADLIBS = "Madlibs";


    private Context context;
    private ArrayList<MadLibsModel> madLibsList;
    private RecyclerView recyclerView;

    private ListView listView;

    public ChooseMadlibsFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment MadlibsFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static ChooseMadlibsFragment newInstance(ArrayList<MadLibsModel> madlibs) {
        ChooseMadlibsFragment fragment = new ChooseMadlibsFragment();
        Bundle args = new Bundle();
        args.putSerializable(MADLIBS,madlibs);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_madlibs,container,false);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        recyclerView = view.findViewById(R.id.mRecyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new
                LinearLayoutManager(view.getContext()));

        //construct list of madlibs
        madLibsList = new ArrayList<MadLibsModel>();
        madLibsList.add(new MadLibsModel("Steve's Dream","Steve M", new MadLibStevesDreamActivity(), R.drawable.stevesdream_image));
        madLibsList.add(new MadLibsModel("Evan's Choices","Evan S", new MadLibsWOOLOO2Activity(), R.drawable.image_evan_cover));
        madLibsList.add(new MadLibsModel("Night in the Forest","Devian Zendejas", new MadLibsNightInTheForestActivity(), R.drawable.nightintheforest_image));
        madLibsList.add(new MadLibsModel("Joe's","Diego Guerra", new MadLibJoesActivity(), R.drawable.joes_image));
        madLibsList.add(new MadLibsModel("Toby's Adventure","Giovanni Marcelo", new MadLibTobysAdventureActivity(), R.drawable.tobysadventure_image));

        //set adapter
        MadLibs_RecyclerViewAdapter adapter = new MadLibs_RecyclerViewAdapter(context, madLibsList);
        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new MadLibs_RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(MadLibsModel model) {
                Log.d("Clicked",model.getTitle());
                Intent intent = new Intent(context,model.getActivity().getClass());
                startActivity(intent);
            }
        });
    }
}