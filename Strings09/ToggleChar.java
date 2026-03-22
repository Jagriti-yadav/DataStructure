package Strings09;
import java.util.*;

//toggle characters of string - capital to small , small to capital(special character except spacebar  and numbers, all will be changed )

public class ToggleChar {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter any string");
    StringBuilder str = new StringBuilder(sc.nextLine());

    for(int i =0 ;i<str.length();i++){
      char ch = str.charAt(i);
      if(ch == ' '){
        continue;
      }
      int asciVal = (int)ch;
      if(asciVal>=97){
        asciVal -= 32;
        char dh = (char)asciVal;
        str.setCharAt(i,dh);
      }else{
        asciVal += 32;
        char dh = (char)asciVal;
        str.setCharAt(i,dh);
      }
    }
    System.out.println(str);
    sc.close();
  }



  /***********************************MORE BETTER APPROACH************************************/

  // second method to do same thing- (special character and numbers will not change)
  // public static void main(String[] args){
  //   Scanner sc = new Scanner(System.in);
  //   StringBuilder str = new StringBuilder(sc.nextLine());
  //   for(int i = 0; i < str.length(); i++){
  //     char ch = str.charAt(i);
  //     if(Character.isLowerCase(ch)){
  //       str.setCharAt(i,Character.toUpperCase(ch));
  //     }else if(Character.isUpperCase(ch)){
  //       str.setCharAt(i,Character.toLowerCase(ch));
  //     }else if(Character.isDigit(ch)){     optional to invert digit 1 to 8 , 2-7,3-6 and so on
    //     int digit = ch - '0';        // convert char → int
    //     int newDigit = 9 - digit;    // invert
    //     str.setCharAt(i, (char)(newDigit + '0'));
    // }
  //   }
  //   System.out.println(str);
    
  // }

}
