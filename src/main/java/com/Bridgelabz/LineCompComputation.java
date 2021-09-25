package com.Bridgelabz;

import java.util.Scanner;

public class LineCompComputation {

    static void compareTo(Double line1, Double line2){
        if (line1 == line2) {
            System.out.println("Both the lines are equal in length.");
        } else if (line1 > line2) {
            System.out.println("Line 1 is greater than Line 2");
        } else {
            System.out.println("Line 2 is greater than Line 1");
        }
    }

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

        double len_of_line1 = (Math.sqrt(Math.pow((X2 - X1), 2)) + Math.pow((Y2 - Y1), 2));
        System.out.println("Length of 1st end point is : " + len_of_line1);

        System.out.println("Enter X co-ordinator of 1st point: ");
        int X3 = sc.nextInt();
        System.out.println("Enter Y co-ordinator of 1st point: ");
        int Y3 = sc.nextInt();
        System.out.println("Enter X co-ordinator of 2nd point: ");
        int X4 = sc.nextInt();
        System.out.println("Enter Y co-ordinator of 2nd point: ");
        int Y4 = sc.nextInt();

        double len_of_line2 = (Math.sqrt(Math.pow((X4 - X3), 2)) + Math.pow((Y4 - Y3), 2));
        System.out.println("Length of 2nd end point is : " + len_of_line2);
        compareTo(len_of_line1, len_of_line2);

    }
}