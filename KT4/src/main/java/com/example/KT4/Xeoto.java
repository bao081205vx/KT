package com.example.KT4;

public class Xeoto {
    private int id;
    private String ten;
    private float gia;
    private String ghichu;

    public Xeoto() {
    }

    public Xeoto(int id, String ten, float gia, String ghichu) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.ghichu = ghichu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public float getGia() {
        return gia;
    }

    public void setGia(float gia) {
        this.gia = gia;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
}