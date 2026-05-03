package hashing;
import java.util.*;

public class hashingMain {
  public static void main(String[] args){
    HashMap<String,Integer> stage = new HashMap<>();
    stage.put("A",24);
    stage.put("B",22);
    stage.put("C",20);
    stage.put("D",19);
    System.out.println("A's age is : "+stage.get("A"));
    System.out.println("All students "+stage);
  }
}
