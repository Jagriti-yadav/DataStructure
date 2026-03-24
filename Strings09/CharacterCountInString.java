package Strings09;
import java.util.*;

//This is a classic string compression (run-length encoding) problem
// 👉 Count consecutive characters and append count only if > 1
//aaabbbbccddde = a3b4c2d3e

public class CharacterCountInString {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    StringBuilder str = new StringBuilder(sc.nextLine());
    StringBuilder result = new StringBuilder();
    int count = 1;
    for(int i = 0 ; i<str.length();i++){
      if(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
        count++;
      }else{
        result.append(str.charAt(i));
        if(count>1){
          result.append(count);
        }
        count=1;//reset
      }
    }
    System.out.println(result);
    sc.close();
  }
}
