package com.example.cardviewdemoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder>{

    private List<NatureModel> objectList;
    private LayoutInflater inflater;

    public MyAdapter(Context context, List<NatureModel> objectList){
        inflater = LayoutInflater.from(context);
        this.objectList = objectList;
    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item,parent,false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        NatureModel current = objectList.get(position);
        holder.setData(current,position);
    }

    @Override
    public int getItemCount() {
        return objectList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView title,price;
        private ImageView img_thumb_nail;
        private int position;
        private NatureModel currentObject;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            title = (TextView) itemView.findViewById(R.id.txt_product_name);
            img_thumb_nail = (ImageView) itemView.findViewById(R.id.img_thumb_nail);
            price = (TextView) itemView.findViewById(R.id.txt_price);

        }

        public void setData(NatureModel currentObject, int position) {
            this.title.setText(currentObject.get_product_name());
            this.price.setText(currentObject.getPrice());
            this.img_thumb_nail.setImageResource(currentObject.getImg_id());
            this.position = position;
            this.currentObject = currentObject;
        }
    }
}