package com.chixpix.model;

public class PlaceOfWork {
    private String company;
    private String position;

    public PlaceOfWork() {
        company = "";
        position = "";
    }

    public PlaceOfWork(String company, String position) {
        this.company = company;
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
