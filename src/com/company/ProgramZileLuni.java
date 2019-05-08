package com.company;
import java.util.Scanner;


public class ProgramZileLuni {

    public static void main(String[] args) {
        String month;

        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter month: ");
        int nrMonth = myObj.nextInt();
//        int nrMonth = 3;

        switch (nrMonth) {
            case 1:  month = "January has 31 days";
                break;
            case 2:  month = "February has 28 days";
                break;
            case 3:  month = "March has 31 days";
                break;
            case 4:  month = "April has 30 days";
                break;
            case 5:  month = "May has 31 days";
                break;
            case 6:  month = "June has 30 days";
                break;
            case 7:  month = "July has 31 days";
                break;
            case 8:  month = "August has 31 days";
                break;
            case 9:  month = "September has 30 days";
                break;
            case 10:  month = "Octomber has 31 days";
                break;
            case 11:  month = "November has 30 days";
                break;
            case 12:  month = "December has 31 days";
                break;


            default : month = "Invalid month";
                break;
        }

        System.out.println(month);



    }
}
