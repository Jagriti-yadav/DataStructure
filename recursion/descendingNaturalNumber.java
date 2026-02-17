package recursion;

import java.util.Scanner;

public class descendingNaturalNumber {

  static void descNaturalNumber(int n){
    if(n<=0){
      return;
    }else{
      System.out.println(n);
      descNaturalNumber(n-1);
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter how many numbers you want : "); 
    int n = sc.nextInt();
    descNaturalNumber(n);
    sc.close();
  }
}
