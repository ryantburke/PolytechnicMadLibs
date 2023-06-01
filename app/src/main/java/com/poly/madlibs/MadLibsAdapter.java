package com.poly.madlibs;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MadLibsAdapter extends ArrayAdapter<MadLib> {
    
    private Context context;
    private int resource;
    
    public MadLibsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<MadLib> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        convertView = layoutInflater.inflate(resource,parent,false);

        ImageView imageView = convertView.findViewById(R.id.image);

        TextView txtName = convertView.findViewById(R.id.txtName);

        imageView.setImageResource(getItem(position).getImageId());

        txtName.setText(getItem(position).getName());


        return convertView;
    }
}
