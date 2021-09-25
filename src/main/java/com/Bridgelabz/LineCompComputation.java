package com.Bridgelabz;

import java.util.Scanner;

public class LineCompComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X co-ordinator of 1st point: ");
        int X1 = sc.nextInt();
        System.out.println("Enter Y co-ordinator of 1st point: ");
        int Y1 = sc.nextInt();
        System.out.println("Enter X co-ordinator of 2nd point: ");
        int X2 = sc.nextInt();
        System.out.println("Enter Y co-ordinator of 2nd point: ");
        int Y2 = sc.nextInt();

        double len_of_line1 =(Math.sqrt(Math.pow((X2-X1),2)) + Math.pow((Y2-Y1) ,2));
        System.out.println("Length of 1st end point is : "+len_of_line1);

        System.out.println("Enter X co-ordinator of 1st point: ");
        int X3 = sc.nextInt();
        System.out.println("Enter Y co-ordinator of 1st point: ");
        int Y3 = sc.nextInt();
        System.out.println("Enter X co-ordinator of 2nd point: ");
        int X4 = sc.nextInt();
        System.out.println("Enter Y co-ordinator of 2nd point: ");
        int Y4 = sc.nextInt();

        double len_of_line2 =(Math.sqrt(Math.pow((X4-X3),2)) + Math.pow((Y4-Y3) ,2));
        System.out.println("Length of 2nd end point is : "+len_of_line2);

        boolean checkEquality = len_of_line1.equals(len_of_line2);
        if (checkEquality)
            System.out.println("Both length of line are equal.");
        else
            System.out.println("Both length of line are not equal.");
    }
}
