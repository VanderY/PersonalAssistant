package com.chixpix.view;

import com.chixpix.ConsoleHelper;
import com.chixpix.controller.AddWindowController;
import com.chixpix.model.Address;
import com.chixpix.model.Person;

import java.io.IOException;
import java.util.ArrayList;

public class AddWindow {

    public AddWindow(ArrayList<Person> personList) throws IOException, InterruptedException {
        AddWindowController controller = new AddWindowController();

        ConsoleHelper.clear();
        System.out.println("Enter person's full name: ");
        String fullName = ConsoleHelper.input();

        ConsoleHelper.clear();
        System.out.println("Is person male?(true/false)");
        String isMale = ConsoleHelper.input();

        ConsoleHelper.clear();
        System.out.println("Enter person's height: ");
        int height = Integer.parseInt(ConsoleHelper.input());

        ConsoleHelper.clear();
        System.out.println("Enter person's weight: ");
        int weight = Integer.parseInt(ConsoleHelper.input());

        ArrayList<Address> addresses;

        addresses = addressesInput();

        controller.addPerson(fullName, true, height, weight, addresses, personList);

        //personList.add(person);
    }

    private ArrayList<Address> addressesInput() throws IOException, InterruptedException {
        ArrayList<Address> addresses = new ArrayList<>();

        while (true) {
            ConsoleHelper.clear();
            System.out.println("Enter person's address");
            System.out.print("Country: ");
            String country = ConsoleHelper.input();
            System.out.print("City: ");
            String city = ConsoleHelper.input();
            System.out.print("Street: ");
            String street = ConsoleHelper.input();
            System.out.print("House Number: ");
            int houseNumber = Integer.parseInt(ConsoleHelper.input());
            Address address = new Address(country, city, street, houseNumber);
            System.out.print("Building: ");
            int building = Integer.parseInt(ConsoleHelper.input());
            address.setBuilding(building);
            System.out.print("Index: ");
            int index = Integer.parseInt(ConsoleHelper.input());
            address.setIndex(index);

            addresses.add(address);

            ConsoleHelper.clear();
            System.out.println("Do you want to enter one more address?(yes/no)");
            if (!ConsoleHelper.input().equals("yes")) {
                break;
            }
        }

        return addresses;
    }
}
