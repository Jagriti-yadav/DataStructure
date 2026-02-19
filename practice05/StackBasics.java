package practice05;
import java.util.*;
public class StackBasics {
  public static void main(String[] args){
    Stack<Integer> stack = new Stack<>();
    stack.push(30);
    stack.push(20);
    stack.push(10);
    stack.push(25);
    
    //displaying elements
    System.out.println(stack);

    // displaying elements using for loops
    for(int n : stack){
      System.out.println(n);

  }
}
}
