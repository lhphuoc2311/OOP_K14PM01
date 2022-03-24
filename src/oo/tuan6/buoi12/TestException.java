/*
*  created date: Mar 24, 2022
*  author: cgm
*/
package oo.tuan6.buoi12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Numerator: ");
        int numerator = 0;
        int denominator = 1;
        int result = 1;
        try {
            numerator = scanner.nextInt();// bon
            System.out.print("Denominator: ");

            denominator = scanner.nextInt();

            result = numerator / denominator;
        }
        catch (ArithmeticException ex2) {
            System.out.println("khong chia 0!!!");
            ex2.printStackTrace();
        } catch (Exception ex) {
            System.out.println("Loi roi tia oi !!!");
            System.out.println("May ne nhap so/con so           do!!!");
            ex.printStackTrace();
        }

        System.out.printf("\nResult: %d / %d = %d\n", numerator, denominator, result);
    }

}
