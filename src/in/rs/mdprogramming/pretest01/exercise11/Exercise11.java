package in.rs.mdprogramming.pretest01.exercise11;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Napisati program koji čita sadržaj txt fajla smeštenog na vašem file sistemu.
 * Kreirajte fajl data.txt i unesite nekoliko linija teksta po vašem izboru.
 * Prikažite sadržaj fajla.
 */
public class Exercise11 {
    public static void main(String[] args) {
        String filePath;
        filePath = "C:\\md\\data.txt";
        String line;
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))){
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        }catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }catch (IOException ex) {
            ex.printStackTrace();
        }catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
