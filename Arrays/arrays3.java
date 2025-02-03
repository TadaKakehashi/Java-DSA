public class arrays2_4 {
    public static int[] getSecondOrderElements(int []a) {
        int max = a[0], max2 = Integer.MIN_VALUE;
        int min = a[0], min2 = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max2 = max;
                max = a[i];
            }
            else if(a[i]>max2 && a[i]<max){
                max2 = a[i];
            }

            if(a[i]<min){
                min2 = min;
                min = a[i];
            }
            else if(a[i]<min2 && a[i]>min){
                min2 = a[i];
            }
        }

        return new int[] {max2,min2};
    }

    public static void main(String[] args){
        int[] arr = {12,1,9,4,10};
        int[] result = getSecondOrderElements(arr); 
        System.out.println("Second Largest Element: "+result[0]+ "\nSecond Smallest Element: "+result[1]);
    }
}

