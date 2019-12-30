package in.rs.mdprogramming.pretest01.exercise09;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Napisati program koji za uneti int broj sa ulaza prikazuje poruku “ODD” ili “EVEN”.
 * Napisati metodu koja je će proveriti da  li je broj paran ili neparan
 * i vratiti rezultata kao true ili false zavisno od unetog broja
 * public static boolean isOdd(int number);
 */
public class Exercise09 {
    public static void main(String[] args) {

        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter number: ");
            int number = sc.nextInt();
            boolean isOdd = isOdd(number);

            if(isOdd) {
                System.out.println(number + " is ODD");
            } else {
                System.out.println(number + " is EVEN");
            }

        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }

    /**
     *
     * @param number
     * @return
     */
    private static boolean isOdd(int number) {
        if(number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }
}
