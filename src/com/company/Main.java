package com.company;

import com.company.common.Hub;

import java.io.IOException;

public class Main {

    private final static int PORT = 3000;

    public static void main(String[] args) {
        try {
            new Hub(PORT);
        }
        catch (IOException e) {
            System.out.println("Can't create listening socket.  Shutting down.");
        }
    }
}
