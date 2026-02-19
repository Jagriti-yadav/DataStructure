package preComputation06;

import java.util.*;

public class pre {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];
        int[] prefix = new int[n + 1];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            prefix[i + 1] = prefix[i] + a[i];
        }

        int q = sc.nextInt();

        while (q-- > 0) {
            int l = sc.nextInt();
            int r = sc.nextInt();

            System.out.println(prefix[r + 1] - prefix[l]);
        }

        sc.close();
    }
}
