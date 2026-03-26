package Strings09;
import java.util.*;
public class Substrings {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any string");
    StringBuilder str = new StringBuilder(sc.nextLine());
    for(int i = 0 ; i<str.length();i++){
      for(int j = i+1;j<=str.length();j++){
        System.out.println(str.substring(i,j));
      }
    }
    sc.close();
  }
}
