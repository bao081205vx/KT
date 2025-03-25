package com.example.KiemThu2;

public class TruyXuat {
    public static int getElementAtIndex(int[] n , int index){
        if(index < 0 || index >= n.length){
            throw new ArrayIndexOutOfBoundsException("Index vuot qua pham vi");
        }
        return n[index];
    }
}
