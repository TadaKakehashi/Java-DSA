import java.util.*;
public class selectionSort{

    public static void selection(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<arr.length;j++){
                // In the inner loop of the selection method,
                //you should start j from i + 1 instead of i because 
                //i is already the current position you’re sorting around. Starting from i + 1 ensures you’re only looking at the unsorted portion of the array.
                if(arr[minIndex]>arr[j]){
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
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
        
        selection(arr);
        System.out.println("Arrays after sorting: ");
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
