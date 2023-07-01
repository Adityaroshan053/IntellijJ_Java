package CodechefPractice;

import java.util.Scanner;

public class OctuberLongC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

          int T = sc.nextInt();
           while (T --> 0){
                int x = sc.nextInt();
                int y = sc.nextInt();
                int a = sc.nextInt();
                int b =sc.nextInt();
               int k = sc.nextInt();

                  int p = x + (a * k);
                 int d = y + (b * k);
                if(p < d){
                        System.out.println("PETROL");
                       }
                else if(d < p){
                        System.out.println("DIESEL");
                        }
               else {
                System.out.println("SAME PRICE");
            }
            }
        }
    }

