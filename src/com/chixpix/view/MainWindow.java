package com.chixpix.view;

import com.chixpix.Main;
import com.chixpix.cls;
import com.chixpix.controller.MainWindowController;
import com.chixpix.model.Address;
import com.chixpix.model.Person;
import com.chixpix.model.PhoneNumber;
import com.chixpix.model.PlaceOfWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class MainWindow {

    public MainWindow() throws IOException, InterruptedException {
        cls.clear();
        System.out.println("Hello there!\nThis is my personal assistant\nPlease select one option:");
        System.out.println("1 - Add a new person");
        System.out.println("2 - Find a person");
        System.out.println("3 - Exit");

        Scanner scanner = new Scanner(System.in);

        String choose = scanner.nextLine();

        if (choose.equals("1")) {
            new AddWindow();
        }

        new MainWindowController();
    }


}
