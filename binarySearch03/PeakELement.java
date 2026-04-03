package binarySearch03;


//there could be multiple peaks in the array
//note - this can give ArrayIndexOutOfBound error , if mid==0 and we search for (arr[mid-1]==indexoutofbound)

public class PeakELement {
  public static void main(String[] args){
    int[] arr = {1,2,1,4,3,4,5,2,1};
    int st = 0;
    int end = arr.length-1;
    while(st<=end){
      int mid = st + (end-st)/2;
      if((mid==0 || arr[mid]>arr[mid-1]) && (mid == arr.length-1|| arr[mid]>arr[mid+1])){
        System.out.println("peak element is "+arr[mid]);
        break;
      }
      if(arr[mid]<arr[mid+1]){
        st = mid + 1;
      }else{
        end = end -1;
      }
    }

  }
}
