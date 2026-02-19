package binarySearch03;

public class FirstOccurence {
  static int firstoccur(int[] a, int x){
    int st = 0, end = a.length-1, count = 0;
    while(st<=end){
      int mid = st + (end-st)/2;
      if(x == a[mid]){
        count = mid;
        end = mid - 1;
      }else if(x < a[mid]){
        end = mid - 1;
      }else {
        st = mid + 1;
      }
    }
    return count;
  }
  public static void main(String[] args){
    int a[] = {1,2,2,3,3,3,3,3,4,4,5,5,6};
    int x = 5 ;
    System.out.println(firstoccur(a,x));
  }
}
