package com.poly.madlibs;

import android.app.Activity;
import android.widget.ImageView;

import java.io.Serializable;

public class MadLib implements Serializable {

    private Activity activity;
    private String name;
    private int imageId;

    public MadLib(Activity activity, String name, int imageId) {
        this.activity = activity;
        this.name = name;
        this.imageId = imageId;
    }

    public Activity getActivity() {
        return activity;
    }

    public String getName() {
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
