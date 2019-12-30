package in.rs.mdprogramming.pretest01.exercise01;

/**
 * Napiši java program koji kreira promenljivu tipa String i dodeljuje joj vrednost po Vašem izboru
 * i prikazuje (štampa) vrednost promenljive uz poruku:
 *
 * Moja String promenljiva se zove naziv i ima vrednost:vrednost
 *
 * Ponovite gore navedeni zadatak za int, float, double, char i boolean tipove promenljih.
 */
public class Exercise01 {

    public static void main(String[] args) {
        String myString = "HELLO";
        System.out.println("My String variable is called \"myString\" and value is: " + myString);

        int myInt = 1;
        System.out.println("My int variable is called \"myInt\" and value is: " + myInt);

        float myFloat = 1.1f;
        System.out.println("My float variable is called \"myFloat\" and value is: " + myFloat);

        double myDouble = 1.1;
        System.out.println("My double variable is called \"myDouble\" and value is: " + myDouble);

        char myChar = 'A';
        System.out.println("My char variable is called \"myChar\" and value is: " + myChar);

        boolean myBoolean = true;
        System.out.println("My int variable is called \"myBoolean\" and value is: " + myBoolean);
    }
}
