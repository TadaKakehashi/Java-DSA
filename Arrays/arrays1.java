
//Largest element in the array
/* https://www.naukri.com/code360/problems/largest-element-in-the-array-largest-element-in-the-array_5026279?interviewProblemRedirection=true&practice_topic%5B%5D=Arrays&attempt_status=COMPLETED */
import java.util.* ;
import java.io.*; 

public class arrays1 {

    static int largestElement(int[] arr, int n) {
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}