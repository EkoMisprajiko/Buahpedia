package com.example.buahpedia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CardViewListBuahAdapter extends RecyclerView.Adapter<CardViewListBuahAdapter.CardViewHolder> {

    private ArrayList<Buah> listBuah;
    private Context context;
    private Activity activity;

    public CardViewListBuahAdapter(Context context) {
        this.context = context;
    }

    public ArrayList<Buah> getListBuah() {
        return listBuah;
    }

    public void setListBuah(ArrayList<Buah> listBuah) {
        this.listBuah = listBuah;
    }

    @Override
    public CardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_buah_cardview, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardViewHolder holder, int position) {
        final Buah b = getListBuah().get(position);
        Glide.with(context).load(b.getGambar()).override(550,550).into(holder.imgBuah);
        holder.tvNamaBuah.setText(b.getNama());
        holder.tvLatinBuah.setText(b.getLatin());
        holder.buah = b;

    }

    @Override
    public int getItemCount() {
        return getListBuah().size();
    }

    public void startactivity(Intent intent){

    }

    public class CardViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgBuah;
        TextView tvNamaBuah, tvLatinBuah;
        Button btnDetail;
        Buah buah;

        public CardViewHolder(View itemView) {
            super(itemView);
            imgBuah = (ImageView) itemView.findViewById(R.id.img_buah);
            tvNamaBuah = (TextView) itemView.findViewById(R.id.tv_nama_buah);
            tvLatinBuah = (TextView) itemView.findViewById(R.id.tv_nama_latin);
            btnDetail = (Button) itemView.findViewById(R.id.btn_detail);
            btnDetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, DetailBuahActivity.class);
            intent.putExtra("key", buah);
            context.startActivity(intent);
        }
    }

}