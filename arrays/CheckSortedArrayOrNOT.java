package arrays;

//ascending order or not
public class CheckSortedArrayOrNOT {
  public static void main(String[] args){
    int[] a = {0,1,2,3};
    Boolean check = true;
    for(int i = 0 ; i < a.length-1 ; i++){
      if(a[i]>a[i+1]){
        check = false;
        break;
      }
    }
    System.out.println(check);
  }
}
