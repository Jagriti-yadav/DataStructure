package sorting11;
import java.util.*;

public class MergeSort {
  
  public static void mergeSort(Vector<Integer> arr, int st, int end){
    if(st<end){
      int mid = st + (end - st)/2;
      mergeSort(arr,st,mid);
      mergeSort(arr,mid+1,end);
      merge(arr,st,mid,end);
    }
    
  }
  public static void merge(Vector<Integer> arr, int st, int mid, int end){
    Vector<Integer> temp = new Vector<>();
    int i = st , j = mid+1;
    while(i<=mid && j<=end){
      if(arr.get(i)<=arr.get(j)){  //for descending order change the sign to >=
        temp.add(arr.get(i));
        i++;
      }else{
        temp.add(arr.get(j));
        j++;
      }
    } 
    //adding remaining elements
    while(i<=mid){
      temp.add(arr.get(i));
      i++;
    }
    while(j<=end){
      temp.add(arr.get(j));
      j++;
    }

    //copy back to original array
    for(int idx = 0 ; idx < temp.size() ; idx++){
      arr.set(st+idx,temp.get(idx));
    }
  }
  public static void main(String[] args){
    Vector<Integer> arr = new Vector<>(Arrays.asList(40,30,34,45,55,12,41));
    mergeSort(arr,0,arr.size()-1);
    for(int val : arr){
      System.out.print(val+ " ");
    }
  }
}
