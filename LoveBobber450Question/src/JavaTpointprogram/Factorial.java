package JavaTpointprogram;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number ");
        long no=sc.nextLong();
    long fact =1;
    for (int i = 1;i<= no;i++){
            fact = fact*i;
        }
        System.out.println("Factorial of the No is "+fact);
    }
}