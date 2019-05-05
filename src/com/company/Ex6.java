package com.company;

import java.util.Scanner;

public class Ex6{
    public static void main(String[] args)
    {
        int n;
        Scanner myObj = new Scanner(System.in);
        System.out.println("Introduceti numarul: ");
        n = myObj.nextInt();
        for(int i=1;i<n;i++)
        {
            if(i%2==1)
            {
                System.out.println(i);
            }
            else if(i%2==0)
            {
                continue;
            }
        }
    }
}
