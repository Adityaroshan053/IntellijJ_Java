package StringJava;

public class CountCharacter {
    public static void main(String[] args) {
        String s = "Hello Bro";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)!=' ')
                count++;

        }
        System.out.println("No of Character in String is "+count);
    }
}

