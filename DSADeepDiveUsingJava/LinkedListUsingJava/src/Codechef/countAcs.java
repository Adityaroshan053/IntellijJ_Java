package Codechef;

import java.util.Scanner;

public class countAcs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();
        int s;
        while (t-->0){
            int p=sc.nextInt();
            if(p>0){
                int v=p/100;
                int r=p%100;
                s=v+r;
                if(s>10){
                    System.out.println("-1");
                }
                else {
                    System.out.println(s);
                }
            } else {
                System.out.println("0");
            }


        }
    }
}
