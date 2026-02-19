package Strings;

public class Palindrome {

  static boolean isPalindrome(String str){
    int i = 0;
    int j = str.length()-1;
    while(i<j){
      if(str.charAt(i)!= str.charAt(j))
      return false;
    i++;
    j--;
    }
    return true;
  }
  public static void main(String[] args){
    String[] test = {"madam","racecar","hello","level","java"};
    for(String str: test){
      if(isPalindrome(str)){
        System.out.println(str+" is a palindrome");
      }else{
        System.out.println(str+" is not a palindrome");
      }
    }
  }
}
