package Practice;

import java.util.Scanner;

public class ReverseNo {
        public static void reverseNumber(int n) {
            if(n < 10) {
                System.out.print(n);
                return;
            }
            else
            {
                System.out.print(n%10);
                reverseNumber(n/10);
            }
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.print("Reverse of the number is ");
            reverseNumber(n);
        }

    }

