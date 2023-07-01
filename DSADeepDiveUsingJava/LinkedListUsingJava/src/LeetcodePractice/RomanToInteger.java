package LeetcodePractice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public int romanToInt(String s) {
        Map<Character, Integer> romanMap = new HashMap<>();
        // Fill the map
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);
        s=s.replace("IV","IIII");
        s=s.replace("IX","VIIII");
        s=s.replace("XL","XXXX");
        s=s.replace("XC","LXXXX");
        s=s.replace("CD","CCCC");
        s=s.replace("CM","DCCCC");
        int number=0;
        for(int i=0;i<s.length();i++)
        {
            number=number+ (romanMap.get(s.charAt(i)));
        }

        return number;

    }

    public static void main(String[] args) {
        String s="MCMCXIV";
    }

}
