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

        double len_of_line =(Math.sqrt(Math.pow((X2-X1),2)) + Math.pow((Y2-Y1) ,2));
        System.out.println("Length of end point is : "+len_of_line);
    }
}
