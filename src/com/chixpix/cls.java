package com.chixpix;

import java.io.IOException;

public class cls {
    private static void main(String... arg) throws IOException, InterruptedException {
        new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
    }
    public static void clear() throws IOException, InterruptedException {
        main("");
    }
}
