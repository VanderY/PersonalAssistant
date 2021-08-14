package com.chixpix.view;

import com.chixpix.ConsoleHelper;
import com.chixpix.controller.MainWindowController;
import com.chixpix.model.Address;
import com.chixpix.model.Person;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainWindow {
    private ArrayList<Person> personList;

    public MainWindow() throws IOException, InterruptedException {
        personList = new ArrayList<>();



        while (true) {
            ConsoleHelper.clear();
            System.out.println("Hello there!\nThis is my personal assistant\nPlease select one option:");
            System.out.println("1 - Add/Change person data");
            System.out.println("2 - Find a person");
            System.out.print("3 - Exit\n> ");
            String choose = ConsoleHelper.input();
            switch (choose) {
                case "1":
                    new AddWindow(personList);
                    break;
                case "2":
                    personOutput();
                    break;
                case "3":
                    return;
                default:
                    System.out.print("Please enter correct option number!\n> ");
                    break;
            }
        }
    }

    private void personOutput() throws IOException, InterruptedException {
        ConsoleHelper.clear();
        for (Person person : personList) {
            System.out.print(person.getFullName() + " | " + person.getHeight() + " | " + person.getWeight() + " | ");
            System.out.println(person.isMale());
            addressOut(person);
        }
        System.out.println("\n\nPress enter to return to main menu...");
        ConsoleHelper.input();
    }

    private void addressOut(Person person){
        ArrayList<Address> addresses = person.getAddresses();
        for (Address address : addresses) {
            System.out.println("\t|\n" + "\t-" + address.getCountry() + ", г." + address.getCity() + ", ул." +
                    address.getStreet() + ", д." + address.getHouseNumber() + "/" + address.getBuilding() + ", " + address.getIndex());
        }
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }
}
