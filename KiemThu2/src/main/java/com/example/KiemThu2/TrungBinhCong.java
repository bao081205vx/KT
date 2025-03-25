package com.example.KiemThu2;

public class TrungBinhCong {
    public static float TBCong(int [] n){
        if(n.length == 0){
            throw new ArithmeticException("Mang rong");
        }
        int sum = 0;
        for (int num : n){
            sum+=num;
        }
        return (float) sum/n.length;
    }
}
