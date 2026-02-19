package practice05;
import java.util.*;
public class HashMapBasic {

  //hasmap sorted the data
  //hashmap replaced the value if same key is get inserted
  //only unique key can be inserted in the hashmap
  //values can be duplicate
  public static void main(String[] args){
    HashMap<Integer,String> map = new HashMap<>();
    map.put(1,"Apple");
    map.put(2,"Banana");
    map.put(3,"Kiwi");
    map.put(3,"Orange");
    map.put(5,"Papaya");
    map.put(4,"Grapes");

    for(Map.Entry<Integer,String> entry : map.entrySet()){
      System.out.println(entry.getKey()+" - " + entry.getValue());
    }

    System.out.println(map.containsKey(1));
    System.out.println(map.containsValue("Apple"));
    System.out.println(map.containsValue("hello"));
    System.out.println(map.get(3));
    System.out.println(map.isEmpty());
    System.out.println(map.size());
    System.out.println(map.remove(3));
  }
}
