package Strings09;
import java.util.*;
public class CountPalindromicSubstring {

  //example - abba have palindromic substrings as {a,abba,b,bb,b,a} = which contains duplicacy 
  //to remove duplicacy add dsa(set or hashmap).
  static boolean isPalindrome(String str){
    int i = 0;
    int j = str.length()-1;
    while(i<=j){
      if(str.charAt(i)!=str.charAt(j)) return false;
      i++;
      j--;
    }
    return true;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    int count = 0;
    for(int i=0; i<str.length();i++){
      for(int j=i+1;j<=str.length();j++){
        if(isPalindrome(str.substring(i,j))){
          System.out.print(str.substring(i,j)+" ");
          count++;
        }
      }
    }
    System.out.println();
    System.out.println("number of palindromic substrings "+count);
    sc.close();
  }
}
