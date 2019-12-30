package in.rs.mdprogramming.pretest01.exercise07;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Za unetu vrednost celog broja (size) prikazati sledeće paterne:
 * Enter the size: 8
 * a)
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4 5 6
 * 1 2 3 4 5 6 7
 * 1 2 3 4 5 6 7 8
 *
 * b)
 * 1 2 3 4 5 6 7 8
 *   1 2 3 4 5 6 7
 *     1 2 3 4 5 6
 *       1 2 3 4 5
 *         1 2 3 4
 *           1 2 3
 *             1 2
 *               1
 */
public class Exercise07 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows: ");
            int size = sc.nextInt();
            System.out.println("First pattern: ");
            for(int i=1;i<=size;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print(j+ " ");
                }
                System.out.println();
            }

            System.out.println("Second pattern: ");
            for(int i=1;i<=size;i++) {
                for(int j=1;j<=size;j++) {
                    if(i>j) {
                        System.out.print("  ");
                    } else {
                        System.out.print(j-i+1 + " ");
                    }
                }
                System.out.println();
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
