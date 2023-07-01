package Practice;

import java.util.Scanner;

public class CountVowelConsoInaString {
    static  void countCharacterType (String str) {
        int vowels=0; int conso=0; int  digit=0;

        for(int i=0;i<str.length();i++){
            char ch= str.charAt(i);
            if((ch>='a' && ch<='z') || (ch >='A' && ch<='Z' )) {
                ch = Character.toLowerCase(ch);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    conso++;
                }
            }
            else if(ch>='0' && ch<='9'){
                digit++;
            }
            }
        System.out.println("Number of Vowels:"+vowels);
        System.out.println("Number of Consonants:"+conso);
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        countCharacterType(str);



    }
    }


