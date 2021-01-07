package com.example.idelist;

public class ModelIDE {
    int logo;
    String nama;

    public ModelIDE(int logo, String nama) {
        this.logo = logo;
        this.nama = nama;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
}
