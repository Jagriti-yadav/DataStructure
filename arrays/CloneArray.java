package arrays;

public class CloneArray {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int[] arr2 = arr.clone();
    for(int i = 0 ; i < arr2.length;i++){
      System.out.print(arr[i] + " ");
    }  
  }
}
