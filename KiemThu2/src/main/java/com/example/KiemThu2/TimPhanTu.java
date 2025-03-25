package com.example.KiemThu2;

public class TimPhanTu {
    public static int PhanTu(int[] n){
        if(n.length == 0){
            throw new ArithmeticException("Mang rong");
        }
        int a = n[0];
        for(int b : n){
            if(b<a){
                a=b;
            }
        }
        return a;
    }
}
