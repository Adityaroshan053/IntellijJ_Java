package SelectionSort;

public class SelectionImplimentation {
    public static void main(String[] args) {
        int[] arr = {20, 35, -15, 7, 55, 1, -22};
        for (int LastUnsortedIndex = arr.length - 1; LastUnsortedIndex > 0; LastUnsortedIndex--) {
            int largest = 0;
            for (int i = 1; i <= LastUnsortedIndex; i++) {
                if (arr[i] > arr[largest]) {
                    largest = i;
                }
            }
            swap(arr, largest, LastUnsortedIndex);

        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void swap(int []arr,int i,int j){
        if (i==j){
            return;
        }
        int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
    }



