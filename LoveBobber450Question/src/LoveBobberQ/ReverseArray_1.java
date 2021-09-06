package LoveBobberQ;

public class ReverseArray_1 {
    public static void main(String[] args) {
        int [] a = {25,26,27,28,29,30 };
        System.out.println("Given array is : ");
        for ( int element : a) System.out.println(element);
        System.out.println("Lenth of the array is "+ a.length);

        System.out.println("Reverse of The Array is : ");
         for (int i =a.length -1 ;i>=0;i--) {
            System.out.println(a[i]) ;
        }



    }
}