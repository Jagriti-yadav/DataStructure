package arrays;

public class MinMaxElement {
  public static void main(String[] args){

    int[] arr = {1,4,5,2,3};
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;

    for(int i = 0 ; i < arr.length ; i++){
      if(arr[i]>max){
        max = arr[i];
      }
    }
    for(int i = 0; i < arr.length ; i++){
      if(arr[i]<min){
        min = arr[i];
      }
    }
    System.out.println(max);
    System.out.println(min);

  }
}
