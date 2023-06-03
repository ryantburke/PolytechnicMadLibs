package com.poly.madlibs;

import android.app.Activity;

import java.io.Serializable;

public class MadLibsModel implements Serializable {

    private Activity activity;
    private String name, author;
    private int imageId;

    public MadLibsModel(String name, String author, Activity activity,  int imageId) {
        this.activity = activity;
        this.name = name;
        this.author = author;
        this.imageId = imageId;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getTitle() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getImageId() {
        return imageId;
    }
}
