package practice;
public class Sum{
  static boolean findSum(int[] a,int t){
    int n = a.length;
    int sum = 0;
    for(int i = 0; i<=n-3;i++){
      sum = a[i]+a[i+1]+a[i+2];
      if(sum == t){
        System.out.println("found at index "+i+", "+(i+1)+" and "+(i+2));
        return true;
      }
    }
    return false;
  }
  public static void main(String[] args){
    int[] a = {2,3,7,8,9,12,15};
    int t = 18;
    System.out.println(findSum(a,t));
  }
}