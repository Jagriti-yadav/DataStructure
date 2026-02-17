package practice;
import java.util.Arrays;

public class FibonacciMemo {

    // Global memoization array
    static int[] memo = new int[1000];

    static int fib(int n) {
        if (n <= 2) return 1;

        if (memo[n] != -1) {   
            return memo[n];
        }

        memo[n] = fib(n - 1) + fib(n - 2);  
        return memo[n];
    }

    public static void main(String[] args) {

        
        Arrays.fill(memo, -1);

        System.out.println("fib(10) = " + fib(10));
        System.out.println("fib(20) = " + fib(20));
    }
}