package slidingwindow08;

public class MaxSumSubArray {
  static int SumSubArray(int[] a,int k){
    int sum = 0;
    for(int i = 0; i < k ; i++){
      sum += a[i];
    }
    int max = sum;
    for(int i = 1; i<=a.length-k;i++){
      sum = sum - a[i-1] + a[i+k-1];
      if(sum>max){
        max = sum;
      }
    }
    return max;
  }
  public static void main(String[] args){
    int[] arr = {3,8,2,5,7,6,12};
    int k = 3;
    System.out.println(SumSubArray(arr,k));
  }
}
