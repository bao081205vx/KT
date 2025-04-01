package com.example.KT4;

public class SinhVien {
    private int masv;
    private String tensv;
    private String lop;
    private String khoahoc;
    private String monhoc;

    public SinhVien() {
    }

    public SinhVien(int masv, String tensv, String lop, String khoahoc, String monhoc) {
        this.masv = masv;
        this.tensv = tensv;
        this.lop = lop;
        this.khoahoc = khoahoc;
        this.monhoc = monhoc;
    }

    public int getMasv() {
        return masv;
    }

    public void setMasv(int masv) {
        this.masv = masv;
    }

    public String getTensv() {
        return tensv;
    }

    public void setTensv(String tensv) {
        this.tensv = tensv;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getKhoahoc() {
        return khoahoc;
    }

    public void setKhoahoc(String khoahoc) {
        this.khoahoc = khoahoc;
    }

    public String getMonhoc() {
        return monhoc;
    }

    public void setMonhoc(String monhoc) {
        this.monhoc = monhoc;
    }
}
