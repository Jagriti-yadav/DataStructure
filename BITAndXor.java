import java.util.*;

public class BITAndXor {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int[] arr1 = new int[m];
    int n = sc.nextInt();
    int[] arr2 = new int[n];

    for(int i=0;i<m;i++){
      arr1[i]=sc.nextInt();
    }
    for(int j=0;j<n;j++){
      arr2[j]=sc.nextInt();
    }
    int[] arr3 = new int[m*n];
    int k=0;
    for(int i=0;i<m;i++){
      for(int j =0;j<n;j++){
        if(k==m*n-1) break;
        arr3[k++]=arr1[i]&arr2[j];
        System.out.print(arr3[k]+" ");
      }
    }
    System.out.println();  
    sc.close();  
  }
}
