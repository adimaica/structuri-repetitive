package com.company;

public class Ex10 {
    public static void main(String[] args) {
        int[] sirNumere = {2, 14, 5, 7, 10, 12, 6, 8, 24, 15, 20};
        int suma = 0;
        int j=0;
        for(int i=0; i< sirNumere.length; i++)
        {
            if(sirNumere[i]%2 == 0 && j<5)
            {
                j++;
                suma = suma + sirNumere[i];
            }
        }
        System.out.println(suma);
    }
}
