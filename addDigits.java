import java.util.*;

public class addDigits {
  static int sumDigits(int num){
    int sum = 0;

    while(num>0){
      int digit = num%10;
      sum = sum + digit;
      num = num / 10;
      
    }
    if(sum>0){
      
    }
    return sum;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any number");
    int num = sc.nextInt();
    int result = sumDigits(num);
    if(result>9){
      int result2 = sumDigits(result);
      System.out.println(result2);
    }else{
      System.out.println(result);
    }
    sc.close();
  }
}
