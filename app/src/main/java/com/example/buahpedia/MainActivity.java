package com.example.buahpedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvListBuah;
    private ArrayList<Buah>list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //inisialisasi
        rvListBuah = (RecyclerView)findViewById(R.id.rv_listbuah);
        rvListBuah.setHasFixedSize(true);

        list = new ArrayList<>();
        list.addAll(BuahData.getListData());
        showRecylerCardView();
    }

    private void showRecylerCardView() {
        rvListBuah.setLayoutManager(new LinearLayoutManager(this));
        CardViewListBuahAdapter cardViewPresidentAdapter= new CardViewListBuahAdapter(this);
        cardViewPresidentAdapter.setListBuah(list);
        rvListBuah.setAdapter(cardViewPresidentAdapter);
    }
}
