package com.example.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        DecimalFormat format = getDecimalFormat();

        //2nd task

        System.out.println("-5 + 8 * 6 = " + format.format(-5 + 8 * 6));
        System.out.println("(55 + 9) % 9) = " + format.format((55 + 9) % 9));
        System.out.println("20 + -3 * 5/8 = " + format.format(20 + -3 * 5 / 8));
        System.out.println("5 + 15 / 3 * 2 - 8 % 3 = " + format.format(5 + 15 / 3 * 2 - 8 % 3));


        //3rd task

        System.out.print("Enter 1st numeric value: ");
        Scanner scanner = new Scanner(System.in);
        int d1 = scanner.nextInt();

        System.out.print("Enter 2nd numeric value: ");
        int d2 = scanner.nextInt();

        System.out.println("Select operation: + - * / %");

        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+': {
                System.out.println("Result: " + sum(d1, d2));
                break;
            }
            case '-': {
                System.out.println("Result: " + subs(d1, d2));
                break;
            }
            case '*': {
                System.out.println("Result: " + mult(d1, d2));
                break;
            }
            case '/': {
                System.out.println("Result: " + div(d1, d2));
                break;
            }
            case '%': {
                System.out.println("Result: " + remain(d1, d2));
                break;
            }

        }

        //4th task

        System.out.print ("Enter number of elements in array of numbers ");
        int i = scanner.nextInt();
        System.out.println("Enter elements(number) of array. Press enter/return after each element.");
        double[] array = new double[i];
        for (int j = 0; j < i; j++) {
            array[j] = scanner.nextDouble();
        }

        double arraySum = arraySum(array);
        System.out.println("Sum of all elements in array: " + format.format(arraySum));

        //5th task

        System.out.print("Enter number of elements in array of numbers ");
        int e = scanner.nextInt();
        System.out.println("Enter integer elements of array. Press enter/return after each element.");
        int[] arrayInt = new int[e];
        for (int j = 0; j < e; j++) {
            arrayInt[j] = scanner.nextInt();
        }
        arrayDuplicates(arrayInt);


    }

    private static DecimalFormat getDecimalFormat() {
        return new DecimalFormat("0.#");
    }


    private static int sum(int d1, int d2) {
        return d1 + d2;
    }

    private static int subs(int d1, int d2) {
        return d1 - d2;
    }

    private static int mult(int d1, int d2) {
        return d1 * d2;
    }

    private static int div(int d1, int d2) {
        return d1 / d2;
    }

    private static int remain(int d1, int d2) {
        return d1 % d2;
    }

    private static double arraySum(double[] array) {
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result = result + array[i];
        }
        return result;
    }

    private static void arrayDuplicates(int[] array) {
        int l = array.length;
        System.out.print("Found following duplicates in array ");
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (array[i] == array[j]) {
                    System.out.print(" " + array[i]);
                }

            }
        }
    }


}
