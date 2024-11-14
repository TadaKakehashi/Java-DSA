public class recursion3 {
    public static void recursionNum(int i, int n, int sum){
        if(i == n){
            sum += i;
            System.out.println(sum);
            return;           
        }
        sum += i;
        recursionNum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main( String[] args){
        recursionNum(1,5,0);
    }
}
