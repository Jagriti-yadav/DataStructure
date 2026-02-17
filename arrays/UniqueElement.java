package arrays;

public class UniqueElement {
  static int findUnique(int[] a){
    for(int i = 0; i < a.length ; i++){
      for(int j = i+1; j < a.length ; j++){
        if(a[i] == a[j]){
          a[i] = -1;
          a[j] = -1;
        }
      }
    }
    int ans = -1;
    for(int i = 0; i < a.length ; i++){
      if(a[i]>0){
        ans = a[i];
      }
    }
    return ans;
  }
  public static void main(String[] args){
    int[] a = {1,1,2,2,3,3,4,4,5,6,6};
    int result = findUnique(a);
    System.out.println(result);
  }
}
