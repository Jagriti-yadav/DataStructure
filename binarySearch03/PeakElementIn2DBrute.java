package binarySearch03;

// brute force approach - to find peak element in 2D array
public class PeakElementIn2DBrute {
  public static void main(String[] args){

    int[][] arr = {{2,4,5},{3,4,6},{1,2,3}};
    int n = arr.length;
    int m =arr[0].length;
    
    for(int i = 0; i<arr.length;i++){
      for(int j = 0;j<arr[0].length;j++){
        boolean isPeak = true;
        if(i>0 && arr[i][j]<arr[i-1][j]){
          isPeak = false;
        }
        if(i<n-1 && arr[i][j]<arr[i+1][j]){
          isPeak = false;
        }
        if(j>0 && arr[i][j]<arr[i][j-1]){
          isPeak = false;
        }
        if(j<m-1 && arr[i][j]<arr[i][j+1]){
          isPeak = false;
        }
        if(isPeak){
          System.out.println("peak element is "+arr[i][j]);
          break;
        }
      }  
    } 
     
  }
}
