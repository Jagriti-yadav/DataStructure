package stack;

//array implementation of stack
public class arrayImplementation {
  public static class Stack{
    int[] arr = new int[5];
    int idx = 0;
    void push(int x){
      arr[idx]=x;
      idx++;
    }
    int peek(){
      if(idx==0){
        System.out.println("stack is empty");
        return -1;
      }
      return arr[idx-1];
    }
    int pop(){
      if(idx==0){
        System.out.println("stack is empty");
        return -1;
      }
      int popElement = arr[idx-1];
      arr[idx-1] = 0;
      idx--;
      return popElement;
    }
  }
  public static void main(String[] args){
    Stack s = new Stack();
    s.push(30);
    s.push(50);
    s.push(10);
    s.pop();
    s.peek();
  }
}
