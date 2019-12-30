package in.rs.mdprogramming.pretest01.exercise06;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.SimpleTimeZone;

/**
 * Za unetu vrednost celog broja (rows) prikazati sledeće paterne:
 * Rows = 5
 *
 *           #
 *         # # #
 *       # # # # #
 *     # # # # # # #
 *   # # # # # # # # #
 */
public class Exercise06 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter rows: ");
            int rows = sc.nextInt();
            for(int i=1;i<=rows;i++){
                for(int j=1;j<rows*2;j++) {
                    if(j<=rows-i || j>=rows+i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("# ");
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
