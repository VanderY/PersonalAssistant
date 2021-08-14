package com.chixpix.controller;

import com.chixpix.model.Address;
import com.chixpix.model.Person;
import com.chixpix.model.PhoneNumber;
import com.chixpix.view.MainWindow;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class AddWindowController {
    public AddWindowController(){

    }

    public void addPerson(String fullName, boolean isMale, int height, int weight, ArrayList<Address> addresses, ArrayList<Person> personList){
        Person person = new Person();

        person.setFullName(fullName);
        person.setMale(isMale);
        person.setHeight(height);
        person.setWeight(weight);
        person.setAddresses(addresses);

        personList.add(person);
    }

}
