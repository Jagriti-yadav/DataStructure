package arrays;


//Count number of elements strictly greater than target
//if element is present in the array then return the count number of elements strictly greater than target element otherwise return there is no target element.

public class StricltyGreater {
  public static void main(String[] args){
    int[] a = {1,2,3,6,4,8};
    int target = 2;
    int count = 0;
    boolean found = false;
    for(int i = 0 ; i < a.length; i++){
      if(a[i] == target){
        found  =  true;
      }
      if(a[i]>target){
        count++;
      }
    }
    if(found == true){
      System.out.println(count);
    }else{
      System.out.println("Element is not present in the array");
    }
    
  }
}
