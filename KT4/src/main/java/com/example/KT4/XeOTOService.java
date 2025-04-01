package com.example.KT4;

import java.util.ArrayList;
import java.util.List;

public class XeOTOService {
    private List<Xeoto> dsxe;
    public XeOTOService(){
        this.dsxe = new ArrayList<>();
    }
    public void add(Xeoto xe){
        if (xe.getGia() < 0) {
            throw new IllegalArgumentException("Gia xe khong the la so am!");
        }
        for (Xeoto Xe : dsxe) {
            if (Xe.getId() == xe.getId()) {
                throw new IllegalArgumentException("Xe trung id!");
            }
        }
        dsxe.add(xe);
    }
    public List<Xeoto> getListXe(){
        return dsxe;
    }
    public void update(Xeoto xe, int id){
        boolean isUpdated = false;
        for(int i = 0 ; i < dsxe.size();i++){
            if(dsxe.get(i).getId() == id){
                dsxe.set(i,xe);
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            throw new IllegalArgumentException("Khong tim thay xe co ID: " + id);
        }
    }
    public void delete(int id){
        dsxe.removeIf(xe -> xe.getId()==id);
    }
}
