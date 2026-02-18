package recursion;
import java.util.*;

public class StrongNum{
  static int fact(int n){
    
    if(n==0||n==1){
      return 1;
    }
    return n*fact(n-1);  
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter any number");
    int n = sc.nextInt();
    int original = n;
    int sum = 0;
    while(n>0){

      int digit = n%10;
      sum = sum + fact(digit);
      n = n / 10;

    }
    
    if(sum == original){
      System.out.println("Strong number");
    }
    else{
      System.out.println("Not strong number");
    }
    sc.close();
  }
}
