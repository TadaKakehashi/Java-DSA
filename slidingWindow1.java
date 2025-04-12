package slidingWindow;

public class slidingWindow1 {
    public static int maxSumSubarray(int[] arr, int k){
        if(arr.length<k){
            throw new IllegalArgumentException("Array size should be greater than or equal to window size k");
        }

        int maxSum = 0;
        int currentWindow = 0;

        for(int i=0;i<k;i++){
            currentWindow+=arr[i];
        }
        maxSum = currentWindow;

        for(int i=k;i<arr.length;i++){
            currentWindow += arr[i]-arr[i-k];
            maxSum = Math.max(maxSum,currentWindow);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        int k = 3;
        int result = maxSumSubarray(arr, k);
        System.out.println("The maximum sum of a subarray of size " + k + " is: " + result);
    }
}
