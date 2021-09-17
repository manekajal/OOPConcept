package org.polymorphism.runtime;

public class Main {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getRateOfInterest());

        b = new ICICI();
        System.out.println("ICICI Rate of Interest: " + b.getRateOfInterest());
    }
}
