package basicPrograms;
import java.util.Scanner;


public class Power {
    public static  void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X:");
        double x = sc.nextInt();

        System.out.print("Enter y:");
        double y = sc.nextInt();

        System.out.print("Enter z:");
        double z = sc.nextInt();

        float power = (float) Math.pow(x , y/z);

        System.out.print( (int) x + " ^ " + " ( " + (int) y + " / " + z + ") = " + power);
    }
}
