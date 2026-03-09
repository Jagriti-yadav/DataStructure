package stack;
import java.util.*;

public class reverseStack {
  public static void main(String[] args){
    Stack<Integer> st = new Stack<>();
    st.push(3);
    st.push(4);
    st.push(6);
    st.push(2);
    System.out.println(st);

     //reverse stack element
    Stack<Integer> reverseStack = new Stack<>();
    while(st.size()>0){
      reverseStack.push(st.pop());
    }
    System.out.println(reverseStack);

    //reversing again to maintain same order as st into result stack
    Stack<Integer> resultStack = new Stack<>();
    while(reverseStack.size()>0){
      resultStack.push(reverseStack.pop());
    }
    System.out.println(resultStack);
  }
}
