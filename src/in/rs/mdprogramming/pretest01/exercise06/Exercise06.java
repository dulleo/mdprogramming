package in.rs.mdprogramming.pretest01.exercise06;

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
        int rows = 5;
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
    }
}
