package com.sch.springboot.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

import java.time.LocalDateTime;

@Entity
public class Employee {

    @Id
    private int sno;
    private String name;
    private String department;
    private String address;


    @Column(name = "edate", nullable = false)
    private LocalDateTime edate;

    @PrePersist
    public void perPersist() {
        if (this.edate == null) {
            this.edate = LocalDateTime.now();
        }
    }

//    private String edate;
//
//    public void setEdate(String edate) {
//        this.edate = edate;
//    }

    public LocalDateTime getEdate() {
        return edate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public String getName() {
        return name;
    }

    public int getSno() {
        return sno;
    }
}
