package practice05;
import java.util.Scanner;
import java.util.Vector;

public class TwoRangeSum {
    public static void main(String[] args) {

        int[] arr = { 2, 1, 3, 5, 4, 7, 10, 6 };

        // Prefix sum vector
        Vector<Integer> prefix = new Vector<>();
        int sum = 0;
        for (int x : arr) {
            sum += x;
            prefix.add(sum);
        }

        Scanner sc = new Scanner(System.in);

        // Range 1
        int L1 = sc.nextInt();
        int R1 = sc.nextInt();

        // Range 2
        int L2 = sc.nextInt();
        int R2 = sc.nextInt();

        int sum1 = (L1 == 0) ? prefix.get(R1)
                : prefix.get(R1) - prefix.get(L1 - 1);

        int sum2 = (L2 == 0) ? prefix.get(R2)
                : prefix.get(R2) - prefix.get(L2 - 1);

        System.out.println("Range Sum = " + sum1);
        System.out.println("Range Sum = " + sum2);
        sc.close();
    }
}
