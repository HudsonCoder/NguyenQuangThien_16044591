package com.example.student.nqt_cau1;

public class movie {
    private String name;
    private String quoctich;
    private String giatien;

    public movie(String name, String quoctich, String giatien) {
        this.name = name;
        this.quoctich = quoctich;
        this.giatien = giatien;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuoctich() {
        return quoctich;
    }

    public void setQuoctich(String quoctich) {
        this.quoctich = quoctich;
    }

    public String getGiatien() {
        return giatien;
    }

    public void setGiatien(String giatien) {
        this.giatien = giatien;
    }
}
