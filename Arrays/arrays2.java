public class arrays2 {
    public static void main(String[] args) {
        int arr[] = {3,2,1,5,2,10,22};
        int max = arr[0];
        int secL = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                max=arr[i];
            }
        }
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>secL && arr[i]<max){
                secL=arr[i];
            }
        }

        System.out.println("Largest element: "+max);
        System.out.println("Second Largest element: "+secL);
    }
}
