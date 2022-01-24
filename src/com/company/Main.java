package com.company;

import java.util.Scanner;

public class Main extends Throwable {

    public static void main(String[] args) throws IllegalTriangleException {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh tam giác");
        System.out.println("Cạnh a: ");
        double a = input.nextDouble();
        System.out.println("Cạnh b: ");
        double b = input.nextDouble();
        System.out.println("Cạnh c: ");
        double c = input.nextDouble();

        Triangle triangle;
        try {
            triangle = new Triangle(a, b, c);
            System.out.printf("Diện tích: %.2f, Chu vi: %.2f\n", triangle.getArea(), triangle.getPerimeter());
        } catch (Main e) {
            System.out.println(e.getMessage());
        }
    }
}
