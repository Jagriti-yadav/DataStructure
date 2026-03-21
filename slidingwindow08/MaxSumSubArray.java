package slidingwindow08;
import java.util.*;

public class MaxSumSubArray{
  static int SumSubArray(int[] arr,int k){
    int Currentsum = 0;
    int n = arr.length;
    for(int i = 0 ; i < k;i++){
      Currentsum += arr[i];
    }
    int max = Currentsum;

    //sliding window
    for(int i = 1;i<=n-k;i++){
      Currentsum = Currentsum - arr[i-1] + arr[i+k-1];
      if(max<Currentsum){
        max = Currentsum;
      }
    }
    return max;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter window size -");
    int[] arr = {3,8,2,1,7,0,5,4};
    int k = sc.nextInt();
    int max = SumSubArray(arr,k);
    System.out.println(max);
    sc.close();
  }
  
}
