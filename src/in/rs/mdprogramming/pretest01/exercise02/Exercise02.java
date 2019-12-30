package in.rs.mdprogramming.pretest01.exercise02;

import java.util.InputMismatchException;
import java.util.MissingFormatArgumentException;
import java.util.Scanner;

/**
 * Unesite dva cela broj sa standardnog unosa. Izračunajte +.-,/,*,%,++,--
 */
public class Exercise02 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("First number: ");
            int firstNumber = sc.nextInt();
            System.out.print("Second number: ");
            int secondNumber = sc.nextInt();
            System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
            System.out.println(firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
            System.out.println(firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber));
            System.out.println(firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber));
            System.out.println(firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
            System.out.println(firstNumber + "++  = " + (firstNumber++));
            System.out.println("++" + firstNumber + " = " + (++firstNumber));
            System.out.println(firstNumber + "--  = " + (firstNumber--));
            System.out.println("--" + firstNumber + " = " + (--firstNumber));
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
