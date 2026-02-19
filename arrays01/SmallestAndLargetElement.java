package arrays01;
import java.util.*;

public class SmallestAndLargetElement {
  public static void main(String[] args){
    int[] a = {3,4,2,1,5};
    Arrays.sort(a);
    // System.out.println(Arrays.toString(a));
    int[] ans = {a[0],a[a.length-1]};
    System.out.println(Arrays.toString(ans));
  }
}
