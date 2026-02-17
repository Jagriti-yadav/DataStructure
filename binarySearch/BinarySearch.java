package binarySearch;
import java.util.*;
public class BinarySearch {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array - ");
    int n = sc.nextInt();
    int[] a = new int[n];

    System.out.println("Enter elements of array : ");
    for(int i = 0; i < n ; i++){
      a[i] = sc.nextInt();
    }
    
    System.out.println("enter your target-");
    int t = sc.nextInt();
    int st = 0;
    int end = n-1;
    while(st<=end){
      int mid = st+(end-st)/2;
      if(a[mid]==t){
        System.out.println(a[mid]+" found at index "+mid);
        break;
      }else if(t<a[mid]){
        end = mid - 1;
      }else{
        st = mid + 1;
      }
    }
    if(st>end){
      System.out.println("element does not found");
    } 

    sc.close();
  }
}
