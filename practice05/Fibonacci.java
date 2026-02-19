package practice05;
public class Fibonacci {
  public static void main(String[] args){
    int n  = 5 ;
    if(n == 0){
      System.out.println(n);
    }
    int a = 0 , b = 1; 
    if (n > 1) {
      System.out.print(b + " "); // 1
    }
    
    for(int i = 0; i<n; i++){
      int c = a + b;
      System.out.println(c + "");
      a = b;
      b = c;
    }
    
  }
}
