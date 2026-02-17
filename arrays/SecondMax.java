package arrays;

public class SecondMax {
  static int findMax(int[] a){
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < a.length ; i++){
      if(max < a[i]){
        max = a[i];
      }
    }
    return max;
  }
  public static void main(String[] args){
    int[] a = {1,5,3,6,8};
    int max = findMax(a);
    for(int i = 0 ; i < a.length ; i++){
      if(a[i]==max){
        a[i] = Integer.MIN_VALUE;
      }
    }
    int secondMax = findMax(a);
    System.out.println(secondMax);
  }
}
