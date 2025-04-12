package slidingWindow;

public class slidingWindow2 {
    public static int window(int[] arr, int k){
        if(arr.length<k){
            return -1;
        }
        int maxSum=0;
        for(int i=0;i<(arr.length-k)+1;i++){
            int sum = 0;
            for(int j=i;j<i+k;j++){
                sum += arr[j];
            }
            maxSum = Math.max(maxSum,sum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4,5,6};
        int k = 3;
        System.out.println(window(arr, k));
    }
}
