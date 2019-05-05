package com.company;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args)
    {
        //int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        int n = myObj.nextInt();
        int pasi = 1;
        while(n!=1){
            if(n%2==0){
                n = n/2;
            }
            else n = n*3+1;

            pasi++;
        }
        System.out.println("Numarul de pasi este: " + pasi);
    }
}
