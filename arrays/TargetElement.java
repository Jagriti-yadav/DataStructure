package arrays;

public class TargetElement {

  static int target(int[] arr , int x){
    int ans = -1;
    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]==x){
        ans = i;
        break;
      }
    }
    return ans;
  }
  public static void main(String[] args){
    int[] arr = {1,2,3,5,6,6};
    int x = 6;
    System.out.println(target(arr,x));
  }
}
