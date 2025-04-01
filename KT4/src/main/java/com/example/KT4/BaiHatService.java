package com.example.KT4;

import java.util.ArrayList;
import java.util.List;

public class BaiHatService {
    private List<BaiHat> dsbh;

    public BaiHatService() {
        this.dsbh = new ArrayList<>();
    }
    public void add(BaiHat baiHat){
        if (baiHat.getDodai() <= 0) {
            throw new IllegalArgumentException("Do dai phai la so nguyen duong !");
        }
        for (BaiHat bh : dsbh) {
            if (bh.getId() == baiHat.getId()) {
                throw new IllegalArgumentException("trung id!");
            }
        }
        dsbh.add(baiHat);
    }
    public List<BaiHat> getAll(){
        return dsbh;
    }
    public void delete(String id){
        dsbh.removeIf(bh -> bh.getId().equals(id));
    }
}
