//простейшая консольная программа
//1 практика
package lab1console;

import java.util.Scanner;

public class Lab1Console {

    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);

            System.out.print("Введите X(число):");
            double x = scan.nextDouble();
            System.out.print("Введите B (число, более нуля):");
            double b = scan.nextDouble();
            System.out.print("Введите D(число, более нуля):");
            double d = scan.nextDouble();
            double y;

            if (x >= 8) {
                y = (x - 2) / (Math.pow(x, 2));
            } else {
                y = (Math.pow(b, 2)) * d + 4 * (Math.pow(x, 3));
            }

            System.out.format("Y=%.3f", y);
            // System.out.print("Y="+y);
            System.out.println();
        } catch (Exception e) {
            System.out.println("Входные параметры заданы неверно!");
        }

    }
}
