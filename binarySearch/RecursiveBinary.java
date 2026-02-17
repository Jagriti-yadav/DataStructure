package binarySearch;

public class RecursiveBinary {
  
  static boolean recur(int[] a, int t, int st, int end){
    if(st>end){
      return false;
    }
    
      int mid = st + (end-st)/2;
      if(a[mid]==t){
        return true;
      }else if(t < a[mid]){
        return recur(a,t,st,mid-1);
      }else{
        return recur(a,t,mid+1,end);
      }
    }
  
  public static void main(String[] args){
    int[] a = {2,3,4,5,6};
    int t = 6, st=0, end = a.length - 1;
    System.out.println(recur(a,t,st,end));
  }
}
