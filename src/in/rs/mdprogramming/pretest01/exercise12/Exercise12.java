package in.rs.mdprogramming.pretest01.exercise12;

import java.nio.charset.IllegalCharsetNameException;
import java.util.*;

/**
 * Kreirajte listu Integer koja će sadržati random brojeve od 1 do 10. Lista ima 10 brojeva.
 * Kreirajte mapu koja će prikazati koliko određenih brojava postoji u listi
 * List is:
 * 1 2 1 2 5 4 6 7 8 9
 * Map is:
 * 1-2
 * 2-2
 * 3-0
 * 4-1
 * 5-1
 * 6-1
 * 7-1
 * 8-1
 * 9-1
 * 10-1
 *
 * Kreirajte metodu koja će vam vratiti random broj od 1 do 10.
 */
public class Exercise12 {
    static int max = 10;
    static int min = 1;

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=1;i<=10;i++) {
            map.put(i, 0);
        }

        for(int i=1;i<=10;i++) {
            numbers.add(getRandomNumber());
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Map: " + map);

        for(Integer number:numbers) {
            if(map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            }
        }
        System.out.println("Count Map: " + map);
    }

    private static Integer getRandomNumber() {
        return (int)(Math.random() * ((max - min) + 1)) + min;
    }
}
