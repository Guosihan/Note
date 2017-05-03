package com.example.gsh.note;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.ViewHolder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gsh on 2017/5/3.
 */

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.ViewHolder> {
    private ArrayList<NoteData> mArrayList;
    public NoteAdapter(ArrayList<NoteData>mArrayList){
        this.mArrayList=mArrayList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view=LayoutInflater.from(parent.getContext()).inflate(R.layout.noteitem, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        NoteData noteData = mArrayList.get(position);

        holder.tvTitle.setText(noteData.getTitle());
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView imgHead;
        TextView tvTitle;
        TextView tvSecondTitle;
        TextView tvCreatTime;
        TextView tvChangeTime;

        public ViewHolder(View itemView) {
            super(itemView);

            imgHead = (ImageView) itemView.findViewById(R.id.img_head);
            tvTitle = (TextView) itemView.findViewById(R.id.tv_title);
            tvSecondTitle = (TextView) itemView.findViewById(R.id.tv_secondtitle);
            tvCreatTime = (TextView) itemView.findViewById(R.id.tv_creatime);
            tvChangeTime = (TextView) itemView.findViewById(R.id.tv_changetime);



        }
    }
}
