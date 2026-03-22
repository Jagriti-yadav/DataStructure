//find peak element index in a MOUNTAIN ARRAY(leetcode 852)

package binarySearch03;


public class PeakIndexInArray {
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,3,2,1};
    int st = 0 ;
    int end = arr.length-1;
    int ans = -1; //if answer does not exist
    while(st<=end){
      int mid = st+(end-st)/2;
      if(arr[mid]<arr[mid+1]){
        ans = mid + 1;
        st = mid + 1;
      }else{
        end = mid - 1;
      }
    }
    System.out.println("Peak element is at index "+ans);
  }
}


//brute force approach -
// public class PeakIndexInArray {
//   public static void main(String[] args){
//     int[] arr = {1,2,3,4,5,3,2,1};
//     for(int i = 0; i<arr.length;i++){
//       if(arr[i]>arr[i+1]){
//         System.out.println("Peak Element is at index "+i);
//         break;
//       }
//     }
//   }
// }



