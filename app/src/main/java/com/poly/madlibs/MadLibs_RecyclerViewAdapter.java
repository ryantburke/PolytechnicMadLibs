package com.poly.madlibs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MadLibs_RecyclerViewAdapter extends RecyclerView.Adapter<MadLibs_RecyclerViewAdapter.MyViewHolder> {

    Context context;
    ArrayList<MadLibsModel> madLibsModels;

    public MadLibs_RecyclerViewAdapter(Context context, ArrayList<MadLibsModel> madLibsModels) {
        this.context = context;
        this.madLibsModels = madLibsModels;
    }


    @NonNull
    @Override
    public MadLibs_RecyclerViewAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycler_view_row, parent, false);
        return new MadLibs_RecyclerViewAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MadLibs_RecyclerViewAdapter.MyViewHolder holder, int position) {
        holder.tvTitle.setText((madLibsModels.get(position).getTitle()));
        holder.tvAuthor.setText(madLibsModels.get(position).getAuthor());
        holder.imageView.setImageResource(madLibsModels.get(position).getImageId());

    }

    @Override
    public int getItemCount() {
        return madLibsModels.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView tvTitle, tvAuthor;


        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.iv_image);
            tvTitle = itemView.findViewById((R.id.tv_title));
            tvAuthor = itemView.findViewById(R.id.tv_author);
        }
    }
}
