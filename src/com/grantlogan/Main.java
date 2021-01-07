package com.grantlogan;

public class Main {

    public static void main(String[] args) {
        printSquareStar(8);
    }


    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(" ");
        System.out.println("This pattern was created using the number " + number);
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                if (i == 1 || i == number) {
                    System.out.print("*");
                } else if (j == 1 || j == number) {
                    System.out.print("*");
                } else if (i == j) {
                    System.out.print("*");
                } else if (j == number - i + 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}