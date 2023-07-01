package StringJava;

import java.util.Locale;

public class CountVovelConsonent {
    public static void main(String[] args) {
        String s="This is a really simple sentence.";
        int temp=0;
        int count=0;
        s=s.toLowerCase();
        for (int i=0;i<s.length();i++){
            if(s.charAt(i)=='a' || s.charAt(i)=='e' ||s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') {
                temp++;
            }
            else if(s.charAt(i)>='a' && s.charAt(i)<='z') {
                count++;
            }
        }
        System.out.println("Number of vovels = "+temp);
        System.out.println("Number of Constant = "+count);
    }
}
