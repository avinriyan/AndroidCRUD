package com.larapin.belajarapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Avin on 16/05/2018.
 */

public class MahasiswaResponse {

    public String getMahasiswa() {
        return mahasiswa;
    }

    public void setMahasiswa(String mahasiswa) {
        this.mahasiswa = mahasiswa;
    }

    @SerializedName("mahasiswas")
    private String mahasiswa;
}
