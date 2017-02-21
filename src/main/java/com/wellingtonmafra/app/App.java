package com.wellingtonmafra.app;
import java.util.Scanner;

import com.wellingtonmafra.domain.model.Length;
import com.wellingtonmafra.domain.model.Triangle;

public class App {
    
    public static void main(String[] args) {
        double[] sides = getSides();

        System.out.print("\nTriangle sides: ");
        System.out.println(sides[0] + " " + sides[1] + " " + sides[2]);

        Triangle triangle = new Triangle(Length.of(sides[0]), Length.of(sides[1]), Length.of(sides[2]));
        System.out.println("It is an " + triangle.getType() + " triangle.");
    }
    
    public static double[] getSides() {
        double[] sides = new double[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter side 1:");
        sides[0] = getSideValueFromScanner(sc);

        System.out.println("Enter side 2:");
        sides[1] = getSideValueFromScanner(sc);

        System.out.println("Enter side 3:");
        sides[2] = getSideValueFromScanner(sc);

        sc.close();
        return sides;
    }

    private static double getSideValueFromScanner(Scanner sc) {
        while (!sc.hasNextDouble()) {
            System.out.println("Please, enter a valid number: ");
            sc.nextLine();
        }
        double side = sc.nextDouble();
        sc.nextLine();

        return side;
    }
}