import java.util.Arrays;
import java.util.Scanner;

public class insertionSort {
    public static void insertion(int[] arr){
        for(int i=1;i<arr.length;i++){
            int currentValue = arr[i];
            int j = i-1;
            while(j>=0 && arr[j]>currentValue){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = currentValue;
        }
    }
   public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element for index number: ["+i+"]");
            arr[i] = sc.nextInt();
        }

        System.out.println("The array entered is: ");
        System.out.println(Arrays.toString(arr));

        System.out.println("Array before sorting: ");
        System.out.println(Arrays.toString(arr));
        
        insertion(arr);
        System.out.println("Arrays after sorting: ");
        System.out.println(Arrays.toString(arr));

        sc.close(); // good practice as it would be releasing resources of Scanner
    } 
}
