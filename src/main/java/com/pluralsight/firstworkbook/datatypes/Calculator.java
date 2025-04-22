package com.pluralsight.firstworkbook.datatypes;

import java.util.Scanner;

class Calculator {
    static public int sum(int numb1, int numb2) {

        return numb1 + numb2;
    }

    static public int subtract(int numb1, int numb2) {
        return numb1 - numb2;
    }

    static public int multiply(int numb1, int numb2) {
        return numb1 * numb2;
    }

    static public int modulo(int numb1, int numb2) {
        return numb1 % numb2;
    }

    static public int divide(int numb1, int numb2) {
        if (numb2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return numb1 / numb2;
    }

    static public int divide(int numb1, int numb2, Scanner scan) {
        if (numb2 == 0) {
            while (numb2 == 0){
                System.out.println("type a valid number");
                numb2 = scan.nextInt();
            }
        }
        return numb1 / numb2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        // What is 7 + 3? → 10
        System.out.println("Sum: " + sum(7, 3));
        // What is 10 - 4? → 6
        System.out.println("Sub: " + subtract(10, 4));
        // What is 2 * 5? → 10
        System.out.println("Mult: " + multiply(2, 5));
//         What is 20 / 4? → 5
        System.out.println("Div: " + divide(20, 0));
        System.out.println("Div: " + divide(scan.nextInt(), scan.nextInt(), scan));

        System.out.println("Mod: " + modulo(10, 3));
    }
}
