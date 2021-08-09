package com.chixpix.model;


import java.util.ArrayList;
import java.util.Date;

public class Person {
    private String fullName;
    private boolean isMale;
    private int height;
    private int weight;
    private ArrayList<Address> addresses;
    private ArrayList<PhoneNumber> phoneNumbers;
    private PlaceOfWork placeOfWork;
    private Date birthDate;
    private ArrayList<Person> relatives;
    private String notes;

    public Person() {
        fullName = "";
        isMale = false;
        height = 0;
        weight = 0;
        addresses = new ArrayList<Address>();
        addresses.add(new Address());
        phoneNumbers = new ArrayList<PhoneNumber>();
        birthDate = new Date();
    }

    public Person(String fullName, boolean isMale, int height, int weight, ArrayList<Address> addresses,
                  ArrayList<PhoneNumber> phoneNumbers, Date birthDate) {
        this.fullName = fullName;
        this.isMale = isMale;
        this.height = height;
        this.weight = weight;
        this.addresses = addresses;
        this.phoneNumbers = phoneNumbers;
        this.birthDate = birthDate;
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(ArrayList<Address> addresses) {
        this.addresses = addresses;
    }


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public PlaceOfWork getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(PlaceOfWork placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public ArrayList<Person> getRelatives() {
        return relatives;
    }

    public void setRelatives(ArrayList<Person> relatives) {
        this.relatives = relatives;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}
