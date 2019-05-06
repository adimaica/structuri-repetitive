package com.company;

import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = myObj.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Go");
        }
        System.out.println("Gata");
    }
}
