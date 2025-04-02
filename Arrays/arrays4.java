package question;

import java.util.Arrays;

public class array4{

    public void reverseArray(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        array4 obj = new array4();
        obj.reverseArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
