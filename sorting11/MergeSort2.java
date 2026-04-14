package sorting11;
import java.util.*;

//codetantra question
public class MergeSort2 {
  public static void mergeSort(int[] a , int st, int end){
    if(st<end){
      int mid = st + (end-st)/2;
      mergeSort(a, st, mid);
      mergeSort(a, mid+1, end);
      merge(a,st,mid,end);
    }
  }
  public static void merge(int[] a,int st,int mid,int end){
    Vector<Integer> vector = new Vector<>();
    int i = st, j = mid+1;
    while(i<=mid && j<=end){
      if(a[i]<=a[j]){
        vector.add(a[i]);
        i++;
      }else{
        vector.add(a[j]);
        j++;
      }
    }
    //for remaining elements
    while(i<=mid){
      vector.add(a[i]);
      i++;
    }
    while(j<=end){
      vector.add(a[j]);
      j++;
    }
    for(int m=0;m<vector.size();m++){
      a[st+m] = vector.get(m);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of an array:");
    int n = sc.nextInt();
    int[] a = new int[n];
    for(int i = 0; i<n ; i++){
      a[i] = sc.nextInt();
    }
    for(int i = 0 ; i<n;i++){
      System.out.print(a[i]+" ");
    }
    System.out.println();
    mergeSort(a,0,n-1);
    for(int i = 0 ; i<n;i++){
      System.out.print(a[i]+" ");
    }
    sc.close();
  }
}
