package in.rs.mdprogramming.pretest01.exercise10;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Napisati program koji za unetu osnovu (base) i eksponent (exponent) izračunava stepen.
 * Eksponent je pozitivna celobrojna vrednost a osnova je celobrojna vrednost.
 * Ne koristiti Math klasu
 *
 * Enter the base: 3
 * Enter the exponent: 4
 * 3 raises to the power of 4 is: ????
 */
public class Exercise10 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Base: ");
            int base = sc.nextInt();

            System.out.print("Exponent: ");
            int exponent = sc.nextInt();

            int result = 1;
            for(int i=1; i<=exponent; i++) {
                result = result * base;
            }

            System.out.println(base + " raises to the power of " + exponent + " is: " + result);

        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
