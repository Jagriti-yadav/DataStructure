package stack;
import java.util.*;

public class StackBasics {
  public static void main(String[] args){
    Stack<Integer> st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    System.out.println("enter size of stack");
    int n = sc.nextInt();
    System.out.println("enter elements of stack");

    //we can use st.push(4) method to add each element
    //st.pop()
    //st.peek
    for(int i = 0; i<n;i++){
      st.push(sc.nextInt());
    }
    System.out.println(st);
    sc.close();
  }
}
