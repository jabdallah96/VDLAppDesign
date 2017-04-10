package com.vdl.jad.vdlappdesign;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;


//Adapter for the Recycler view of the popular communities used in the PopularFragment

public class RecyclerViewCommunitiesAdapter extends RecyclerView.Adapter<PopularCommunityViewHolders> {

    private ArrayList<Community> itemList;
    private Context context;

    //private OnLoadMoreListener mOnLoadMoreListener;

    public RecyclerViewCommunitiesAdapter(ArrayList<Community> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public PopularCommunityViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.community_element, null);
        PopularCommunityViewHolders rcv = new PopularCommunityViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(PopularCommunityViewHolders holder, int position) {

        holder.communityTitle.setText(itemList.get(position).getTitle());
        //holder.communityImage.setImageDrawable(itemList.get(position).getImageUri());
        if(itemList.get(position).getImageUri() != ""){
            Picasso.with(context).load(itemList.get(position).getImageUri()).into(holder.communityImage);
        }
        holder.numOfMembers.setText(itemList.get(position).getNumOfMembers() + "");
    }

    // public void setOnLoadMoreListener(OnLoadMoreListener mOnLoadMoreListener) {
    // this.mOnLoadMoreListener = mOnLoadMoreListener;
    // }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }
}