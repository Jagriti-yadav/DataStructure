package binarySearch03;

public class Sqrt {

  static int sqrt(int x){
    int st = 0, end = x , ans = 0;

    while(st<=end){
      int mid = st + (end-st)/2;
      long val = mid * mid;
      if(val == x){
        return mid;
      }else if(val < x){
        ans = mid;
        st = mid + 1;
      }else{
        end = mid - 1;
      }
    }
    return ans;
  }
  public static void main(String[] args){
    int x =35;
    System.out.println(sqrt(x));
  }
}
