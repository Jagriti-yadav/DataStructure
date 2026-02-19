package practice05;
import java.util.*;

public class Array {

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of array - ");
    int n = sc.nextInt();
    int[] a = new int[n];


    //Taking array elements from user
    System.out.println("Enter elements of array : ");
    for(int i = 0; i < n ; i++){
      a[i] = sc.nextInt();
    }


    //Printing array elements on the sreen
    System.out.println("Your array is -");
    //USING FOR LOOP
    // for(int i = 0 ; i < n ; i++){
    //   System.out.print(a[i] + " ");
    // }


    //USING FOR EACH LOOP
    for(int num : a){
      System.out.print(num+" ");
    }
    sc.close();
  }
}
