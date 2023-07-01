package Practice;



import java.util.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.io.*;

class Codechef {
    public static int fun(int n) {
        long count = 0;
        count = ((long) n / 5) * 2;
        if (n % 5 == 1 || n % 5 == 0) {

        }
        else {
            count++;
        }
        return (int) count;
    }

    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        while (testcases-- > 0) {
            int n = sc.nextInt();
            System.out.println(fun(n));
        }
        sc.close();
    }
}
