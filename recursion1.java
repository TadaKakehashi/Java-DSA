//print number from 5 to 1;
public class recursion1 {

    public static void printNum(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        printNum(num-1);
    }
    public static void main(String[] args) {
        int n = 5;
        printNum(n);
    }
    //
}
