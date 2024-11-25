import java.util.Scanner;

public class binarySearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10,20,30,40,50};
        System.out.println("Enter the number to be searched: ");
        int target = sc.nextInt();
        int element = binaryS(arr,target);
        System.out.println("The element was found at index number: "+element);
    }

    public static int binaryS(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end-start) / 2;
            if(target < arr[mid]){
                end = mid-1;
            }
            else if(target > arr[mid]){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
