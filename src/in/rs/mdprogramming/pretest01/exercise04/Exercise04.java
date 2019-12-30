package in.rs.mdprogramming.pretest01.exercise04;

/**
 * Dat je niz brojeva 5,2,1,4,7,9,8. Sortirajte niz u rastućem redosledu
 * Prikažite sortirani niz
 */
public class Exercise04 {
    public static void main(String[] args) {
        int[] myArray = {5,2,1,4,7,9,8};
        System.out.println("Unsorted array: ");
        for(int i : myArray) {
            System.out.print(i +  " ");
        }

        for(int i= 0; i<myArray.length-1; i++) {
            for(int j=i+1;j<myArray.length;j++) {
                if(myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.println("Sorted array: ");
        for(int i : myArray) {
            System.out.print(i +  " ");
        }
    }
}
