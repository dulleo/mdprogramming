package in.rs.mdprogramming.pretest01.exercise08;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * Enter the number of students: 5
 * Enter the grade for student 1: 98
 * Enter the grade for student 2: 78
 * Enter the grade for student 3: 78
 * Enter the grade for student 4: 87
 * Enter the grade for student 5: 76
 * The average is: ?????
 * The minimum is: ???
 * The maximum is: ???
 */
public class Exercise08 {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
            System.out.print("Enter the number of students: ");
            Integer numberOfStudents = sc.nextInt();

            List<Integer> grades = new ArrayList<Integer>();
            System.out.print("Enter the grade for student 1: ");
            Integer gradeStudent1 = sc.nextInt();
            grades.add(gradeStudent1);

            System.out.print("Enter the grade for student 2: ");
            Integer gradeStudent2 = sc.nextInt();
            grades.add(gradeStudent2);

            System.out.print("Enter the grade for student 3: ");
            Integer gradeStudent3 = sc.nextInt();
            grades.add(gradeStudent3);

            System.out.print("Enter the grade for student 4: ");
            Integer gradeStudent4 = sc.nextInt();
            grades.add(gradeStudent4);

            System.out.print("Enter the grade for student 5: ");
            Integer gradeStudent5 = sc.nextInt();
            grades.add(gradeStudent5);
            Integer sum = 0;
            Integer min = grades.get(0);
            Integer max = 0;

            for(Integer grade : grades) {
                sum = sum + grade;
                if(grade > max) {
                    max = grade;
                }
                if(grade<min) {
                    min = grade;
                }
            }

            System.out.println("The average is: " + (double)sum/grades.size());
            System.out.println("The min is: " + min);
            System.out.println("The max is: " + max);


        } catch (InputMismatchException ex) {
            ex.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
