package com.vdl.jad.vdlappdesign;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by jad on 11/12/2016.
 */

public class PopularCommunityViewHolders extends RecyclerView.ViewHolder {

    public TextView communityTitle;
    public ImageView communityImage;
    public TextView numOfMembers;


    public PopularCommunityViewHolders(View itemView) {
        super(itemView);
        communityTitle = (TextView) itemView.findViewById(R.id.textview_community_title);
        communityImage = (ImageView) itemView.findViewById(R.id.community_image);
        numOfMembers = (TextView) itemView.findViewById(R.id.num_members);

    }


}