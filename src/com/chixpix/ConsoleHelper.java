package com.chixpix;

import java.io.IOException;
import java.util.Scanner;

public class ConsoleHelper {
    private static void main(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void clear() throws IOException, InterruptedException {
        main("");
    }
    public static String input(){
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }
}
