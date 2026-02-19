package preComputation06;

public class sumofElements {
  static int[] Sum(int[] arr){
    int[] PS = new int[arr.length];
    PS[0] = arr[0];
    for (int i = 1; i < arr.length ; i++) {   
            PS[i] = arr[i] + PS[i-1];
        }
    return PS;
  }
  static int rangeSum(int[] prefix, int L, int R) {

        if (L == 0) {
            return prefix[R];
        }

        return prefix[R] - prefix[L - 1];
    }
  public static void main(String[] args){
    int[] arr = {1,2,3,4,5,6,7,8};
    int[] prefixArray = Sum(arr);
    int result = (rangeSum(prefixArray, 2, 5));
    System.out.println(result);
  }
}
