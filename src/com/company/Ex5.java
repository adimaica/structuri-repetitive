package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Ex5 {
    public static void main(String[] args){
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        n = myObj.nextInt();
        while(n!=0){
            System.out.print(n + " ");
            n--;
        }
    }

}
