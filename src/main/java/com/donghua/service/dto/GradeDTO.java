package com.donghua.service.dto;

import com.donghua.domain.Grade;
import com.donghua.repository.GradeRepository;

public class GradeDTO {
    private long id;

    private String name;

    private int classNumber;

    private double total;

    public GradeDTO(){

    }

    public GradeDTO(Grade grade){
        this.id = grade.getId();
        this.name = grade.getName();
        this.classNumber= grade.getClassNumber();
        this.total = grade.getTotal();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getClassNumber() {
        return classNumber;
    }

    public void setClassNumber(int className) {
        this.classNumber = classNumber;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "GradeDTO{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", classNumber=" + classNumber +
            ", total=" + total +
            '}';
    }
}
