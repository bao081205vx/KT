package com.example.KT4;

import java.util.ArrayList;
import java.util.List;

public class EmployeesService {
    private List<Employees> em;
    public EmployeesService(){
        this.em = new ArrayList<>();
    }
    public void add(Employees emp){
        for (Employees e : em) {
            if (e.getId() == emp.getId()) {
                throw new IllegalArgumentException("trung id!");
            }
        }
        em.add(emp);
    }
    public List<Employees> getListEmployees(){
        return em;
    }
    public void update(Employees emp, int id){
        boolean isUpdated = false;
        for(int i = 0 ; i < em.size();i++){
            if(em.get(i).getId() == id){
                em.set(i,emp);
                isUpdated = true;
                break;
            }
        }
        if (!isUpdated) {
            throw new IllegalArgumentException("Khong tim thay ID: " + id);
        }
    }
    public void delete(int id){
        em.removeIf(e -> e.getId()==id);
    }
}
