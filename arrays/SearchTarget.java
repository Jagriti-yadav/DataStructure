package arrays;
import java.util.*;

public class SearchTarget {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = {1,2,3,4,5};
    int target = sc.nextInt();
    int ans = -1;
    int n = a.length;
    for(int i = 0; i < n ; i++){
      if(target == a[i]){
        ans = i;
          
          break;
      }
      
    }
    System.out.println(ans);
    
    sc.close();
  }
}
