package com.poly.madlibs;

import android.content.Context;
import android.util.Log;
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
    private OnItemClickListener listener;
    ArrayList<ModelMadLib> madLibsModels;

    public MadLibs_RecyclerViewAdapter(Context context, ArrayList<ModelMadLib> madLibsModels) {
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
        holder.bind(madLibsModels.get(position),listener);
    }

    @Override
    public int getItemCount() {
        return madLibsModels.size();
    }

    public void setOnClickListener(OnItemClickListener listener){
        this.listener = listener;
    }

    public interface OnItemClickListener {
        void onItemClick(ModelMadLib model);
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

        public void bind(final ModelMadLib model, final OnItemClickListener listener) {
            tvTitle.setText((model.getTitle()));
            tvAuthor.setText(model.getAuthor());
            imageView.setImageResource(model.getImageId());
            Log.d("bind",model.getTitle());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Log.d("click",model.getTitle());
                    listener.onItemClick(model);
                }
            });
        }

    }
}
