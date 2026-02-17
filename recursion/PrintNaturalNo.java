package recursion;
import java.util.*;

public class PrintNaturalNo {

  static void printNaturalNumber(int n){
    if(n <= 0){
      return;
    }else{
      printNaturalNumber(n-1);
      System.out.println(n);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter how many numbers you want "); 
    int n = sc.nextInt();
    printNaturalNumber(n);
    sc.close();
  }
}
