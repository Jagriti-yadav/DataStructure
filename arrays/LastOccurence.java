package arrays;

public class LastOccurence {
  public static void main(String[] args){
    int[] a = {1,2,3,4,5,6,4,3,3,3};
    int target = 0;
    int lastIndex = -1;
    for(int i = 0 ; i < a.length ; i++){
      if(a[i] == target){
        lastIndex = i;
      }
    }
    System.out.println(lastIndex);
  }
  
}
