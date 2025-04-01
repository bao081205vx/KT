package com.example.KT4;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    private List<SinhVien> dssv;
    public SinhVienService(){
        this.dssv= new ArrayList<>();
    }
    public void add(SinhVien sv ){
        for (SinhVien svs : dssv) {
            if (svs.getMasv() == sv.getMasv()) {
                throw new IllegalArgumentException("trung !");
            }
        }
        dssv.add(sv);
    }
    public List<SinhVien> getListSV(){
        return dssv;
    }
    public List<SinhVien> searchByMaSV(int masv) {
        List<SinhVien> listSV = new ArrayList<>();
        for (SinhVien sv : dssv) {
            if (sv.getMasv() == masv) {
                listSV.add(sv);
            }
        }
        return listSV;
    }
}
