package basicPrograms;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Priciple:");
            int x = sc.nextInt();

            System.out.print("Enter the rate:");
            float y = sc.nextFloat();

            System.out.print("Enter the time:");
            int z = sc.nextInt();

            float SI = (x * y * z) * 100;

            System.out.println("your Simple Interest is:" + SI);
            System.out.println();

        }

    }


