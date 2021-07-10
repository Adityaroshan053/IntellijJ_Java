package academy.learnprogramming;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int d,x,y,z;
            d = sc.nextInt();
            x = sc.nextInt();
            y = sc.nextInt();
            z = sc.nextInt();
            int ans = 0;
            ans = Math.max(7*x,((d*y)+((7-d)*z)));
            System.out.println(ans);
        }
    }
}
