package Practice;

import java.util.Scanner;

public class TcsReverseNum {
    public static void ReverseNumber(int n) {
        int rem;
        int rev = 0;
        if (n < 10) {
            System.out.println(n);
            return;
        } else {
            while (n > 0) {

                rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }
            System.out.println(rev);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Reverse of the Number is");
        ReverseNumber(n);

    }
}
