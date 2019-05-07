package com.company;

public class Ex3 {
    public static void main(String[] args) {
        int[] array = {10, 7, 9, 26, 15, 39, 16};
        boolean nrImpare = true;
        int max = 1;

        for (int i = 0; i < 7; i++) {
            if (array[i] % 2 != 0) {
                nrImpare = true;
            }
            if (array[i] % 2 != 0 && array[i] > max) {
                max = array[i];
            }
        }
        if (nrImpare == false) {
            System.out.println("No");
        } else {
            System.out.println("Cel mai mare nr impar din sir este " + max);
        }
    }
}
