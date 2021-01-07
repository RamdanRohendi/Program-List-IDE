package com.example.idelist;

public class ModelIDE {
    private int id;
    private int logo;
    private String nama;
    private String penjelasan;
    private String developer;
    private String bahasapemrograman;
    private String link;

    // Ini adalah sebuah Constructor
    // Constructor adalah fungsi yang pertama kali dijalankan
    // Atau akan dijalankan apabila class ini dideklarasi dan diinisialisasikan
    public ModelIDE(int id, int logo, String nama, String penjelasan, String developer, String bahasapemrograman, String link) {
        this.id = id;
        this.logo = logo;
        this.nama = nama;
        this.penjelasan = penjelasan;
        this.developer = developer;
        this.bahasapemrograman = bahasapemrograman;
        this.link = link;
    }

    public int getId() { return id; }

    public int getLogo() {
        return logo;
    }

    public String getNama() {
        return nama;
    }

    public String getPenjelasan() { return penjelasan; }

    public String getDeveloper() { return developer; }

    public String getBahasapemrograman() { return bahasapemrograman; }

    public String getLink() { return link; }

}
