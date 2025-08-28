package com.sch.springboot.dto;

public class Employee {
    private Long sno;
    private String name;
    private String department;
    private String address;
    private String edate;

    public void setEdate(String edate) {
        this.edate = edate;
    }

    public String getEdate() {
        return edate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSno(Long sno) {
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

    public Long getSno() {
        return sno;
    }
}
