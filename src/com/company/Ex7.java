package com.company;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args)
    {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        n = myObj.nextInt();
        int m=3;
        int nr;
        for(int i=0;i<n;i++)
        {
            m*=3;
        }
        nr = 2*m;

        int a=0;
        while(nr!=0)
        {
            a=a+(nr%10);
            nr/=10;
        }

        System.out.println(a);
    }
}
