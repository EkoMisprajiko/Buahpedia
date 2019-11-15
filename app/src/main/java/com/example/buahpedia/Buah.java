package com.example.buahpedia;

import android.os.Parcel;
import android.os.Parcelable;

public class Buah implements Parcelable {
    private String nama, latin, deskripsi, gambar, manfaat, sumber;

    protected Buah(Parcel in) {
        nama = in.readString();
        latin = in.readString();
        deskripsi = in.readString();
        gambar = in.readString();
        manfaat = in.readString();
        sumber = in.readString();
    }

    public static final Creator<Buah> CREATOR = new Creator<Buah>() {
        @Override
        public Buah createFromParcel(Parcel in) {
            return new Buah(in);
        }

        @Override
        public Buah[] newArray(int size) {
            return new Buah[size];
        }
    };

    public Buah() {

    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLatin() {
        return latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public String getManfaat() {
        return manfaat;
    }

    public void setManfaat(String manfaat) {
        this.manfaat = manfaat;
    }

    public String getSumber() {
        return sumber;
    }

    public void setSumber(String sumber) {
        this.sumber = sumber;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.writeString(this.nama);
        parcel.writeString(this.latin);
        parcel.writeString(this.deskripsi);
        parcel.writeString(this.gambar);
        parcel.writeString(this.manfaat);
        parcel.writeString(this.sumber);
    }
}
