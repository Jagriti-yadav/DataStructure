package Strings09;
import java.util.*;

public class AnagramCheck {

  static boolean Anagram(String str1,String str2){
    str1 = str1.toLowerCase();
    str2 = str2.toLowerCase();
    if(str1.length()!=str2.length()){
      return false;
    }
    char[] arr1 = str1.toCharArray();
    char[] arr2 = str2.toCharArray();
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    return Arrays.equals(arr1,arr2);
  }
  public static void main(String[] args){
    String[][] test = {
      {"listen","silent"},
      {"hello","world"},
      {"triangle","integral"},
      {"java","avaj"},
      {"race","care"}
    };
    for(String[] pair:test){
      if(Anagram(pair[0],pair[1])){
        System.out.println(pair[0]+" and "+pair[1]+"  are anagram");
      }else{
        System.out.println(pair[0]+" and "+pair[1]+" are not anagram");
      }
    }
  }
}
