package arrays01;


public class TripletSum {
  static int tripletSum(int[] arr, int target){

    // int[] ans = {0,0,0};
    int ans = 0 ;
    for(int i = 0; i < arr.length; i++){
      for(int j = i + 1; j < arr.length ; j++){
        for(int k = j + 1; k < arr.length ; k++){
          if(arr[i]+arr[j]+arr[k] == target){
            // ans = new int[]{arr[i],arr[j],arr[k]};
            ans++;
          }
        }
      }
    }
    return ans;
  }
  public static void main(String[] args){
    int[] a = {1,2,4,5,6,0,9};
    // int[] result = tripletSum(a,7);
    // System.out.println(Arrays.toString(result));
    int result = tripletSum(a,7);
    System.out.println(result);
    
  }
}
