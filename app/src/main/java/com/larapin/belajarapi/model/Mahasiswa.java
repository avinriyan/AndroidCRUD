package com.larapin.belajarapi.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Avin on 16/05/2018.
 *
 */

public class Mahasiswa {
    private String nama, nim, email, foto;

    public Mahasiswa(){}

    public Mahasiswa(String nama, String nim, String email, String foto) {
        this.nama = nama;
        this.nim = nim;
        this.email = email;
        this.foto = foto;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
