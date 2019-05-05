package com.company;

public class Ex4{

    public static void main(String[] args)
    {
        int[] array={24, 10, 15, 25, 7, 12};
        int nrPar=0;
        int nrImpar=0;
        for(int i=0;i<array.length;i++)
        {
            if(array[i]%2==0)
            {
                nrPar++;
            }
            else if(array[i]%2==1)
            {
                nrImpar++;
            }
        }
        System.out.println("Numerele pare sunt " + nrPar);
        System.out.println("Numerele impare sunt " + nrImpar);
    }
}