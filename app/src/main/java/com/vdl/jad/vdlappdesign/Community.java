package com.vdl.jad.vdlappdesign;

/**
 * Created by jad on 11/12/2016.
 */
public class Community {

    public String title;
    public int numOfMembers;
    public String imageUri;
    public String uid;
    public String description;

    public Community() {

        // Required empty public constructor
    }


    public Community(String title, int numOfMembers, String imageUri, String uid, String description) {
        this.title = title;
        this.numOfMembers = numOfMembers;
        this.imageUri = imageUri;
        this.uid = uid;
        this.description = description;

    }

    //Getters
    public String getTitle() {
        return title;
    }

    public int getNumOfMembers() {
        return numOfMembers;
    }

    public String getImageUri() {
        return imageUri;
    }

    public String getDescription() {
        return description;
    }

    //Setters
    public void setNumOfMembers(int numOfMembers) {
        this.numOfMembers = numOfMembers;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
