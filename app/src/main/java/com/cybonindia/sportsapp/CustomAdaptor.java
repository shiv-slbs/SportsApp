package com.cybonindia.sportsapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CustomAdaptor extends RecyclerView.Adapter<CustomAdaptor.SportsViewHolder> {

    private List<Sport> sportList;

    public ItemClickListener clickListener;

    public void setClickListener(ItemClickListener myListener){
        this.clickListener = myListener;
    }

    public CustomAdaptor(List<Sport> sportList) {
        this.sportList = sportList;
    }



    @NonNull
    @Override
    public SportsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_view_layout,
                        parent,
                        false);
        return new SportsViewHolder(itemView);

    }


    @Override
    public void onBindViewHolder(@NonNull SportsViewHolder holder, int position) {
        Sport sport= sportList.get(position);
        holder.textView.setText(sport.SportName);
        holder.imgView.setImageResource(sport.SportImage);

    }

    @Override
    public int getItemCount() {
        return sportList.size();
    }

    public class SportsViewHolder extends RecyclerView.ViewHolder  implements  View.OnClickListener{
        TextView textView;
        ImageView imgView;


        public SportsViewHolder(@NonNull View itemView) {
            super(itemView);

            textView = itemView.findViewById(R.id.title);
            imgView = itemView.findViewById(R.id.cardImgView);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (clickListener != null){
                clickListener.onClick(v,getAdapterPosition());
            }

        }
    }

}
