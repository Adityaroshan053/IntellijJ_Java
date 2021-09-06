package LoveBobberQ;

public class Max_min_array_2 {
    public static void main(String[] args) {
        int [] a= { 4,2,3,1,5,6};
        int max= a[0];
        for (int i=1;i<a.length;i++ ){
            if (a[0]<a[i]) {
                max=a[i];
            }

        }
        System.out.println("Maximum Number in Array a is :"+max);
        int min=a[0];
        for ( int i=1;i<a.length;i++){
            if (a[0]>a[i]){
                min=a[i];
            }
        }
        System.out.println("Minimum Number in array is :"+min);
    }
}
