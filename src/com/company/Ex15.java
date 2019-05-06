package com.company;

public class Ex15 {
    public static void main(String[] args) {
        int n = 14;
        int m = 41;
        int invers = 0;
        while (n != 0) {
            invers = invers * 10 + n % 10;
            n = n / 10;
        }
        if (invers == m)
            System.out.println("true");

        else
            System.out.println("false");
    }

}

