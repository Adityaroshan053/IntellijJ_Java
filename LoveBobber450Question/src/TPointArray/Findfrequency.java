package TPointArray;

public class Findfrequency {
    public static void main(String[] args) {
        int [] arr1=new  int[]{2,3,4,5,6,7,8,1,2,1,3,4,6,5,7,5,1,1,1,2};
        int count=0;
        for (int i=0;i<arr1.length;i++) {
            for (int j=i+1;j<arr1.length;j++){
                if(arr1[i]==arr1[j] && arr1[i]!=arr1[j]){
                    count++;
                }
            }
        }
        System.out.println(count);


    }
}
