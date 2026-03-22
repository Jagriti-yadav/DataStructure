package Strings09;
import java.util.*;

public class PalindromeString {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any string ");
    StringBuilder str = new StringBuilder(sc.nextLine());

    //note we can't change stringbuilder to string, it will through an error
    String gtr = str.reverse().toString(); //important - reverse will change the original stringbuilder string 
    System.out.println(str);
    System.out.println(gtr);

    //if we do not want to change the original string
    System.out.println("Enter the string ");
    String string = sc.nextLine();
    StringBuilder string2 = new StringBuilder(string);
    string2.reverse();

    //important to convert into string as both are of different types(one is string and other is stringbuilder)
    if(string.equals(string2.toString())){
      System.out.println("string is palindrome");
    }else{
      System.out.println("not palindrome");
    }
    sc.close();
  }
}
