package JavaTpointprogram;

public class Armstrong {
    public static void main(String[] args) {
     int a=153;
     int temp =a;
     int rem;
     int l=0;
     int b1;
     int sum = 0;
     while (temp!=0) {
         rem=temp%10;
         l=l+1;
         temp=temp/10;
     }
        System.out.println("Length of thr Number is "+l);
     while (temp!=0){
         b1=temp%10;
         sum += Math.pow(b1,l);
         temp=temp/10;
     }
        System.out.println(sum);
     if (a == sum){
         System.out.println(a+" is Armstrong Number");
     }
     else {
         System.out.println(a+" is Not Armstrong Number");
     }
    }

}
