package com.example.KiemThu2;

public class TruyXuatDoiTuong {
    private String name;

    public TruyXuatDoiTuong(String name) {
        if (name == null) {
            throw new NullPointerException("Ten ho so de trong");
        }
        this.name = name;
    }

    public String ten () {
        return name;
    }
}
