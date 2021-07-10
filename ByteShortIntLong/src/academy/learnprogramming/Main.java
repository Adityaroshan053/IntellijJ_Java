package academy.learnprogramming;

import javax.annotation.processing.SupportedSourceVersion;
import javax.xml.crypto.dsig.spec.SignatureMethodParameterSpec;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        int no =3;
        int temp = 0;

        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }

        }
        if (temp > 0) {
            System.out.println("Given number is not prime");

        } else {
            System.out.println(" Number is prime");
        }

    }
}