import java.util.*;
public class bubbleSort{
    public static void bubblesort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {

        int arr[] = {10,9,2,1,8};

        System.out.println("Array before sorting: " + Arrays.toString(arr));
        bubblesort(arr);
        System.out.println("Array after sorting: " + Arrays.toString(arr));        
        
    }
}