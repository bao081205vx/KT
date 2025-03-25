package com.example.KiemThu2;

public class TinhThuong {
    public static float Thuong(int a , int b){
        if(b == 0){
            throw new ArithmeticException("Khong chia dc cho so 0");
        }else {
            return (float) a/b;
        }
    }
}
