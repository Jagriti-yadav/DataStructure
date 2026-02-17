package practice;
import java.util.*;

public class TwoSum {
  static int[] twosum(int[] num, int target) {
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < num.length; i++) {
      int complement = target - num[i];
      if (map.containsKey(complement)) {
        return new int[] { map.get(complement), i };
      }
      map.put(num[i], i);
    }
    return new int[] {};
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number: ");
    int t = sc.nextInt();
    int[] num = { 2, 7, 11, 15 };
    int[] result = twosum(num,t);
    System.out.println(Arrays.toString(result));
    sc.close();
  }
}
