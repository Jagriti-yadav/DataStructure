package arrays;
import java.util.*;

public class OccurenceOfNumber {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a[] = {2,2,5,5,6,3,1,1,4};
    System.out.println("Enter any number from 1 to 6 : ");
    int target = sc.nextInt();
    int count = 0 ;
    for(int i = 0; i < a.length ; i++){
      if(a[i] == target){
        count ++;
      }
    }
    System.out.println(count);
    sc.close();
  }
  
}
