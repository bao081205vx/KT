package com.example.KiemThu2;

public class TinhTich {
    public double TinhTich(double a , double b){
        if(a != (int)a || b != (int)b){
            throw new ArithmeticException("So nhap vao khong phai la so nguyen");
        }else {
            return a*b;
        }
    }
}