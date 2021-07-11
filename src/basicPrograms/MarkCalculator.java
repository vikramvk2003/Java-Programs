package basicPrograms;

import java.util.Scanner;

public class MarkCalculator {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        for (; ; ) {


            System.out.print("Enter you or marks: ");
            int x = sc.nextInt();

            if (x >= 90 && x <= 100) {
                System.out.println("You got A1");
            } else if (x >= 80 && x <= 89) {
                System.out.println("You got A2");
            } else if (x >= 70 && x <= 79) {
                System.out.println("You got B1");
            } else if (x >= 60 && x <= 69) {
                System.out.println("You got B2");
            } else if (x >= 50 && x <= 59) {
                System.out.println("You got C1");
            } else if (x >= 40 && x <= 49) {
                System.out.println("You got C2");
            } else if (x >= 34 && x <= 39) {
                System.out.println("You got D1");
            } else if (x <= 33) {
                System.out.println("You Fail");
            } else {
                System.out.println("Enter valid Marks");
            }
        }


    }
}
