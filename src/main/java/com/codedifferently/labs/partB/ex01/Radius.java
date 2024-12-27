package com.codedifferently.labs.partB.ex01;
import java.util.Scanner;
public class Radius {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();

        double area = Math.PI * Math.pow(radius,2);

        System.out.printf("The area of circle is: %.2f\n", area);

    }
}
