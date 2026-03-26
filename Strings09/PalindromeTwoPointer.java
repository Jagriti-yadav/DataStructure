package Strings09;
import java.util.*;
public class PalindromeTwoPointer {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter string ");
    String str = sc.nextLine();
    int i =0;
    int j = str.length()-1;
    boolean flag = true;
    while(i<=j){
       //means string is palindrome
      if(str.charAt(i)!= str.charAt(j)){
        flag = false;
        break;
      }
      i++;
      j--;
    }
    if(flag==true){
      System.out.println("Palindrome");
    }else{
      System.out.println("not palindrome");
    }
    sc.close();
  }
}
