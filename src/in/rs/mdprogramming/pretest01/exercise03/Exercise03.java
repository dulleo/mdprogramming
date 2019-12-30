package in.rs.mdprogramming.pretest01.exercise03;

/**
 * Dat je niz brojeva 1,5,5,5,6,6,8,6.
 * Prikažite dati niz koristeći for i for-each petlje
 */
public class Exercise03 {
    public static void main(String[] args) {
        int[] myArray = {1,5,5,5,6,6,8,6};
        System.out.println("For Loop:");
        for (int i=0; i<myArray.length; i++) {
            System.out.print(myArray[i] + " ");
        }
        System.out.println();
        System.out.println("For-each Loop:");
        for(int i : myArray) {
            System.out.print(i + " ");
        }
    }
}
