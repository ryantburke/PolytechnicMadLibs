package com.poly.madlibs;

import android.app.Activity;

import java.io.Serializable;

public class ModelMadLib implements Serializable {

    private Activity activity;
    private String name, author;
    private int imageId;

    public ModelMadLib(String name, String author, int imageId) {
        this.name = name;
        this.author = author;
        this.imageId = imageId;
    }

    public ModelMadLib(String name, String author, Activity activity, int imageId) {
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
