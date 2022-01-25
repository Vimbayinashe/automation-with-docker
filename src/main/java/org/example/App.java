package org.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello There!");
        try {
            Thread.sleep(100000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
