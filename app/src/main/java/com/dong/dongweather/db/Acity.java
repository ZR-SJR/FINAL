package com.dong.dongweather.db;

public class Acity {
    private String id;
    private String province;
    private String city;
    private String number;
    private String Ename;


    public Acity(String id, String province, String city, String number, String ename) {
        this.id = id;
        this.province = province;
        this.city = city;
        this.number = number;
        Ename = ename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEname() {
        return Ename;
    }

    public void setEname(String ename) {
        Ename = ename;
    }
}
