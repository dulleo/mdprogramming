package in.rs.mdprogramming.pretest01.exercise05;

/**
 * Prikažite tablicu množenja u sledećem obliku
 * 1*1=1
 * 1*2=2
 * 1*3=3
 * .
 * .
 * .
 * 10*10=100
 */
public class Exercise05 {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++) {
            for(int j=1;j<=10;j++) {
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }
    }
}
