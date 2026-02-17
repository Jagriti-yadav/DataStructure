package arrayList;
import java.util.*;

public class BasicsList {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    List<String> list = new ArrayList<>();
    list.add("Mango");
    list.add("Orange");
    list.add("Banana");
    list.add("Grapes");

    for(String s : list){
      System.out.println(s + " ");
    }

    System.out.println(list);
    System.out.println(list.remove("Orange"));
    System.out.println(list.contains("Apple"));
    System.out.println(list.get(1));

    String s = sc.nextLine();
    if(list.contains(s)){
      System.out.println("Element "+s+" is found at "+list.indexOf(s));
    }else{
      System.out.println("Not found");
    }
    sc.close();
  }
}
