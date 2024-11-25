public class binarySearch1 {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        int target = 30;
        System.out.println("The index number of the element: " + binarySearch(arr,target));
    }

    public static int binarySearch(int[] arr,int target) {
        int low = 0;
        int high = arr.length - 1;
        while(low <=high){
            int middlePosition = (low + high) / 2;
            int middleElement = arr[middlePosition];

            if(target == middleElement){
                return middlePosition;
            }
            else if(target < middleElement){
                high = middleElement+1;
            }
            else{
                low = middleElement-1;
            }
        }
        return -1;
    }
}
