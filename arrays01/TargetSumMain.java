package arrays01;
import java.util.*;

public class TargetSumMain {

  static int[] pairSum(int[] arr,int target){
    int[] ans = {0,0};
    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length; j++){
        if(arr[i]+arr[j]==target){
          ans = new int[]{arr[i],arr[j]};
        }
      }
    }
    return ans;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = {1,2,5,6,7,8};
    int target = 7;
    int[] ans = pairSum(a,target);
    System.out.println(Arrays.toString(ans));
    sc.close();
  }
}
