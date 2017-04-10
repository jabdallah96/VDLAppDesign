package com.vdl.jad.vdlappdesign;

import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * Created by jad on 2/12/17.
 */

public class TabPrograms extends Fragment{

    private GridLayoutManager lLayout;
    private RecyclerView rView;
    private RecyclerViewCommunitiesAdapter rcAdapter;
    ArrayList<Community> list = new ArrayList<>();
    String str = "";

    public TabPrograms() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_popular, container, false);

        rView = (RecyclerView) rootView.findViewById(R.id.recycler_view_user_communities);
        rView.setHasFixedSize(true);
        rView.setNestedScrollingEnabled(false);
        lLayout = new GridLayoutManager(getActivity(), 2);
        setHasOptionsMenu(true);

        list = getAllItemList();
        setRecyclerViewAndAdapter(list);

        return rootView;

    }


    //Populating Array with data
    //N.B: This is the only hard coded part in the entire project since
    //the fragment popular display all the popular communities and there is
    //no enough data in the database yet to check which community is popular
    public ArrayList<Community> getAllItemList() {
        ArrayList<Community> allItems = new ArrayList<Community>();
        allItems.add(new Community("شباب وتنمية", 4, "http://vdl.com.lb/new/images/chababwatanmiya.jpg", "10101", "News related"));
        allItems.add(new Community("SPOT ON", 7, "http://vdl.com.lb/new/images/spoton.jpg", "10201", "The Tech Hub"));
        allItems.add(new Community("قراءة ثانية", 12, "http://vdl.com.lb/new/images/randajebaifakhry.jpg", "10203", "All the latest on sports"));
        allItems.add(new Community("الاقتصاد أولاً", 2, str, "10203", "Music, movies, and other entertainment"));
        allItems.add(new Community("Test", 2, str, "10207", "Music, movies, and other entertainment"));
        return allItems;
    }

    //Set Recycler View and Adapter
    private void setRecyclerViewAndAdapter(ArrayList<Community> list) {
        rView.setLayoutManager(lLayout);
        rcAdapter = new RecyclerViewCommunitiesAdapter(list, getContext());
        rView.setAdapter(rcAdapter);
    }
}
