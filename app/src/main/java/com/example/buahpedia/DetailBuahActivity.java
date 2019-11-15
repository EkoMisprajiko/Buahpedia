package com.example.buahpedia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailBuahActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_buah);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Buah buahExtraIntent = getIntent().getParcelableExtra("key");

        ImageView gambar = (ImageView)findViewById(R.id.img_item_photo);
        TextView nama = (TextView)findViewById(R.id.tv_nama_buah_detail);
        TextView latin = (TextView)findViewById(R.id.tv_nama_latin_detail);
        TextView deskripsi = (TextView)findViewById(R.id.tv_deskripsi_detail);
        TextView manfaat = (TextView)findViewById(R.id.tv_manfaat_detail);
        TextView sumber = (TextView)findViewById(R.id.tv_sumber_detail);

        Glide.with(this).load(buahExtraIntent.getGambar()).override(660,550).into(gambar);
        nama.setText(buahExtraIntent.getNama());
        latin.setText(buahExtraIntent.getLatin());
        deskripsi.setText(buahExtraIntent.getDeskripsi());
        manfaat.setText(buahExtraIntent.getManfaat());
        sumber.setText(buahExtraIntent.getSumber());

        Log.i("image", buahExtraIntent.getGambar());
        Log.i("deskripsi", buahExtraIntent.getDeskripsi());
    }
}
