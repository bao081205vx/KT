package com.example.KT4;

public class BaiHat {
    private String id;
    private String ten;
    private String tencasi;
    private int dodai;

    public BaiHat() {
    }

    public BaiHat(String id, String ten, String tencasi, int dodai) {
        this.id = id;
        this.ten = ten;
        this.tencasi = tencasi;
        this.dodai = dodai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTencasi() {
        return tencasi;
    }

    public void setTencasi(String tencasi) {
        this.tencasi = tencasi;
    }

    public int getDodai() {
        return dodai;
    }

    public void setDodai(int dodai) {
        this.dodai = dodai;
    }
}
