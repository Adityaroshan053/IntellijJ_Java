package JavaTpointprogram;

import java.util.Scanner;

public class primenumber {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter The Number");
        int num=sc.nextInt();
        int temp=0;
        for (int i=2;i<=num-1;i++)
            if (num%i==0){
                temp=temp+1;
            }
            if (temp>0){
                System.out.println("Number is Not Prime");
            }
            else {
                System.out.println("Number is prime");
            }


    }
}
