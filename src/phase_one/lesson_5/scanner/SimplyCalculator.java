package phase_one.lesson_5.scanner;

import java.util.Scanner;

public class SimplyCalculator {

    public static int sumNumbers(int num1, int num2){
        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Simple CLI calculator");
            System.out.println("--------------------------\n");
            System.out.println("Enter first number");
            int num1 = scanner.nextInt();
            System.out.println("Enter second number");
            int num2 = scanner.nextInt();

            System.out.println(num1 + " + " + num2 + " = " + sumNumbers(num1, num2));

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
