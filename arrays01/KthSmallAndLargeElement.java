package arrays01;

import java.util.*;

public class KthSmallAndLargeElement {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = {1,2,7,3,8,5,6};
    Arrays.sort(a);
    int k = 6;
    int[] ans = {0,0};
    Arrays.sort(a);
    System.out.println(Arrays.toString(a));
    if(k<=a.length-1 && k>=0){
      ans = new int[]{ a[k-1], a[a.length - k] };
      System.out.println(Arrays.toString(ans));
    }else{
      System.out.println("invalid k");
    }
    
    sc.close();
  }
  
}
