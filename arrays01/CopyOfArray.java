package arrays01;
import java.util.*;


public class CopyOfArray {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5};
    int[] arr2 = Arrays.copyOf(arr,2);
    for(int i = 0; i<arr2.length;i++){
      System.out.println(arr2[i]);
    }
    System.out.println();

    //starting range is inclusive and last range is exclusive while copying the array
    int[] arr3 = Arrays.copyOfRange(arr,0,4);
    for(int i = 0; i<arr2.length;i++){
      System.out.println(arr3[i]);
    }
  }
}
