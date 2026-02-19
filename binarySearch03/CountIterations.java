package binarySearch03;

public class CountIterations {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6};
    int target = 5;
    int n = arr.length;
    int st = 0,end = n-1;
    int iterations = 0;
    while(st<=end){
      iterations++;
      int mid = st + (end - st)/2;
      if(arr[mid]==target){
        System.out.println("element found at index :"+ mid);
        break;
      }else if(arr[mid]<target){
        st = mid + 1;
      }else{
        end = mid - 1;
      }
    }
    System.out.println("iterations =  "+ iterations);
  }
}
