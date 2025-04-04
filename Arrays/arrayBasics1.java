import java.util.Scanner;


public class arrayBasics1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr1 = new int[10];

        for(int i = 0; i <arr1.length; i++){
            System.out.print("Enter number for position "+i+ ": ");
            arr1[i] = sc.nextInt();
        }
        System.out.println();

        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i] +" ");
        }
    }
}
