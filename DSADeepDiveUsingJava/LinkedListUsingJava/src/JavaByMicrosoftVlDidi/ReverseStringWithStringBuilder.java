package JavaByMicrosoftVlDidi;

public class ReverseStringWithStringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder ab=new java.lang.StringBuilder("roshan"); //Reverse the Roshan
        for (int i=0;i<=ab.length()/2;i++) {
            int front=i;
            int back=  ab.length() -1 -i;
            char frontchar= ab.charAt(front);
            char backchar=ab.charAt(back);
            ab.setCharAt(front,backchar);// setting & Replacing the char
            ab.setCharAt(back,frontchar);
        }
        System.out.println(ab);

    }
}
