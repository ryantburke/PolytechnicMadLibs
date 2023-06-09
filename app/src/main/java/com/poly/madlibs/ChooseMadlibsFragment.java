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
    private ArrayList<ModelMadLib> madLibsList;
    private RecyclerView recyclerView;

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
    public static ChooseMadlibsFragment newInstance(ArrayList<ModelMadLib> madlibs) {
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
        madLibsList = new ArrayList<ModelMadLib>();

        madLibsList.add(new ModelMadLib("An Eventful Mugging","Jacob Congolino", new MadLibMuggingActivity(), R.drawable.mugging_image2));
        madLibsList.add(new ModelMadLib("The Birthday Party","Kevin Guzman", new MadLibBirthdayPartyActivity(), R.drawable.birthdayparty_image));
        madLibsList.add(new ModelMadLib("Concert Night","Hannah Schroeder", new MadLibConcertNightActivity(), R.drawable.concertnight_image));
        madLibsList.add(new ModelMadLib("Dragon Slayer","JD Cajimat", new MadLibDragonSlayerActivity(), R.drawable.dragonslayer_image));
        madLibsList.add(new ModelMadLib("Evan's Choices","Evan Soth", new MadLibsWOOLOO2Activity(), R.drawable.image_evan_cover));
        madLibsList.add(new ModelMadLib("Fooding","Jovanni Trujillo", new MadLibFoodingActivity(), R.drawable.fooding_image));
        madLibsList.add(new ModelMadLib("Joe's","Diego Guerra", new MadLibJoesActivity(), R.drawable.joes_image));
        madLibsList.add(new ModelMadLib("Jom and Terry","Matthew Yen", new MadLibJomandTerryActivity(), R.drawable.jomterry_image));
        madLibsList.add(new ModelMadLib("Just a Regular Day","Kayla Deng-Martinez", new MadLibRegularDayActivity(), R.drawable.regularday_image));
        madLibsList.add(new ModelMadLib("Maria's House","Rafael Valencia", new MadLibRafaelActivity(), R.drawable.rafael_image));
        madLibsList.add(new ModelMadLib("Night in the Forest","Devian Zendejas", new MadLibsNightInTheForestActivity(), R.drawable.nightintheforest_image));
        madLibsList.add(new ModelMadLib("Roadtrip","Anaiyah Magee", new MadLibRoadTripActivity(), R.drawable.roadtrip_image));
        madLibsList.add(new ModelMadLib("Steve's Dream","Steve Marquez", new MadLibStevesDreamActivity(), R.drawable.stevesdream_image));
        madLibsList.add(new ModelMadLib("Summer Vacation","Lex Battles", new MadLibSummerVacationActivity(), R.drawable.summervacation_image));
        madLibsList.add(new ModelMadLib("Toby's Adventure","Giovanni Marcelo", new MadLibTobysAdventureActivity(), R.drawable.tobysadventure_image));
        madLibsList.add(new ModelMadLib("...","Jaden Lewis", new MadLibJadenActivity(), R.drawable.jaden_image));

        //set adapter
        MadLibs_RecyclerViewAdapter adapter = new MadLibs_RecyclerViewAdapter(context, madLibsList);
        recyclerView.setAdapter(adapter);
        adapter.setOnClickListener(new MadLibs_RecyclerViewAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(ModelMadLib model) {
                Log.d("Clicked",model.getTitle());
                Intent intent = new Intent(context,model.getActivity().getClass());
                startActivity(intent);
            }
        });
    }
}