package com.infogalaxy.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonProblem {

        //UC-3-Comparison of Two Lines
        public static void equals(double lengthofline1, double lengthofline2) {
            if (lengthofline1 == lengthofline2) {
                System.out.println("Both Lines are Same. ");
            } else {
                if(lengthofline1 > lengthofline2) {
                    System.out.println("1st Line is Greater. ");
                } else {
                    System.out.println("2nd Line is Greater. ");
                }
            }
        }
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            //Welcome Message For User
            System.out.println("Welcome to Line Comparison Computation Problem Developed by Ujwala Dhangar. ");
            //UC-1-Length of Line 1 Calculated
            double x1 ;
            double x2 ;
            double y1 ;
            double y2 ;
            //UC-2-Length of Line 2 Calculated
            double a1 ;
            double a2 ;
            double b1 ;
            double b2 ;
            System.out.println("Enter the Point for X1 and Y1 : ");
            x1 = scanner.nextDouble();
            y1 = scanner.nextDouble();
            System.out.println("Enter the Point for X2 and Y2 : ");
            x2 = scanner.nextDouble();
            y2 = scanner.nextDouble();
            double lengthofline1 = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));
            System.out.println("Length of Line 1 :" +lengthofline1);

            System.out.println("Enter the Point for A1 and B1 : ");
            a1 = scanner.nextDouble();
            b1 = scanner.nextDouble();
            System.out.println("Enter the Point for A2 and B2 : ");
            a2 = scanner.nextDouble();
            b2 = scanner.nextDouble();

            double lengthofline2 = Math.sqrt(Math.pow((a2 - a1) , 2) + Math.pow((b2 - b1) , 2));
            System.out.println("Length of Line 2 : " +lengthofline2);

            equals(lengthofline1,lengthofline2);
        }
    }


