public class recursion8 {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n) {
        if(n < 2){
            return n;
        }
        int result = fibo(n-1) + fibo(n-2);
        return result;
    }
}
