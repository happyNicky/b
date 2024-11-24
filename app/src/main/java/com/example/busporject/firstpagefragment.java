package com.example.busporject;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link firstpagefragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class firstpagefragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private RecyclerView recy;
    private List<dataModel> data;
    private firstpageAddapter adapter;
    private List<String> startSpinner,destinationSpinner;
    private Spinner spinner1,spinner2;

    public firstpagefragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment firstpagefragment.
     */
    // TODO: Rename and change types and number of parameters
    public static firstpagefragment newInstance(String param1, String param2) {
        firstpagefragment fragment = new firstpagefragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
          View view=inflater.inflate(R.layout.fragment_firstpagefragment, container, false);
        recy= view.findViewById(R.id.recycle);
        data= new ArrayList<>();

        // spinner instatiation

        data.add(new dataModel("Adis Abeba", "Cilga"));
        data.add(new dataModel("Shashamane", "Aids Abeba"));
        data.add(new dataModel("Dila", "Wachamo"));
        data.add(new dataModel("AdisAbeba", "Cilga"));
        data.add(new dataModel("Shashamane", "Aids Abeba"));
        data.add(new dataModel("Adis ababa", "Shakiso"));
        data.add(new dataModel("Adis Abeba", "Cilga"));
        data.add(new dataModel("Shashamane", "Aids Abeba"));
        data.add(new dataModel("Dila", "Wachamo"));
        data.add(new dataModel("AdisAbeba", "Cilga"));
        data.add(new dataModel("Shashamane", "Aids Abeba"));
        data.add(new dataModel("Adis ababa", "Shakiso"));


        adapter= new firstpageAddapter(data,getContext());
        recy.setAdapter(adapter);
        recy.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }
}