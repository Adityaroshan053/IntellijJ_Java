package TpointNumberProgram2;

public class ReverseANumber {
    public static void main(String[] args) {
        int a=78509;
        int temp =a;
        int rev=0,rem;
        while(temp!=0) {
            rem=temp%10;
            rev=rev*10+rem;
            temp=temp/10;
        }
        System.out.println("reverse Of Num is "+rev);

    }
}
