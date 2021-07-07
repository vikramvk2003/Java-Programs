package basicPrograms;
import java.util.Scanner;

public class QuadraticEquation {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X:");
        int x = sc.nextInt();

        System.out.print("Enter y:");
        int y = sc.nextInt();
        int z = (x*x + 2*x*y + y*y + 4*x + 2*y);

        System.out.print(x + "^" + 2 + "+" + 2 + "*" + x + "*" + y + "+" + y + "^" + 2 + "+" + 4 + "*" + x + "+" + 2 + "*" + y + " = " +z );


    }

}
