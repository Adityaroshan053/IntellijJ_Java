package DSAUdemy;

public class ArrayRetrive {
    public static void main(String[] args) {
        int [] arr =new int[7];
        arr[0]=20;
        arr[1]=35;
        arr[2]=-15;
        arr[3]=7;
        arr[4]=55;
        arr[5]=1;
        arr[6]=-22;
        int index=0; // or -1;
        for (int i=0;i< arr.length;i++) {
            if(arr[i]==7){
                index =i;
                break;
            }
        }
        System.out.println("index = "+ index);



    }
}
