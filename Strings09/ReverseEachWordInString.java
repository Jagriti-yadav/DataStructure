package Strings09;
import java.util.*;
public class ReverseEachWordInString {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    StringBuilder result = new StringBuilder();

    //split string by space 
    String[] words = str.split(" ");

    for(String word : words){
      StringBuilder sb = new StringBuilder(word);
      result.append(sb.reverse()).append(" ");
    }

    //to trim space after last word
    System.out.println(result.toString().trim());
    sc.close();
  }
}
