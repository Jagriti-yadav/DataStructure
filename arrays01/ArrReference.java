package arrays01;

public class ArrReference{
  static int[] change_array(int[] arr){
    for(int i = 0; i<arr.length;i++){
      arr[i] = 0;
    }
    return arr;
  }
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int[] arr2 = arr;
    int[] arr3 = change_array(arr2);
    for(int i = 0; i<arr3.length;i++){
      System.out.print(arr3[i]+ " ");
    }
  }
}