package com.uaspapb.laundry.Model;

import com.google.gson.annotations.SerializedName;
import java.util.List;

public class ResponseModel {
    @SerializedName("kode")
    int kode;
    @SerializedName("pesan")
    String pesan;
    @SerializedName("data")
    List<DataModel> data;

    public int getKode() {
        return kode;
    }

    public void setKode(int kode) {
        this.kode = kode;
    }

    public String getPesan() {
        return pesan;
    }

    public void setPesan(String pesan) {
        this.pesan = pesan;
    }

    public List<DataModel> getData() {
        return data;
    }

    public void setData(List<DataModel> data) {
        this.data = data;
    }
}
