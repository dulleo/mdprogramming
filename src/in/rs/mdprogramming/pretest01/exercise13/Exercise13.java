package in.rs.mdprogramming.pretest01.exercise13;

import java.util.*;

/**
 * Izmenite zadatak 12 tako što ćete ukupan broj elemenata liste (brojeva) uneti sa std ulaza:
 * Enter total numbers: 20
 */
public class Exercise13 {
    static int max = 10;
    static int min = 1;

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Total numbers: ");
            int totalNumbers = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                map.put(i, 0);
            }
            System.out.println("Map: " + map);

            for (int i = 1; i <= totalNumbers; i++) {
                numbers.add(getRandomNumber());
            }

            System.out.println("Numbers: " + numbers);


            for (Integer number : numbers) {
                if (map.containsKey(number)) {
                    map.put(number, map.get(number) + 1);
                }
            }
            System.out.println("Count Map: " + map);
        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    private static Integer getRandomNumber() {
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
