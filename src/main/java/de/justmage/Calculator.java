package de.justmage;

public class Calculator {

    // this method no longer works
    // try using "git bisect" to find the faulty commit
    // (this is fairly easy but still :)
    public int add(int a, int b) {
        return a + b + 1;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

}
