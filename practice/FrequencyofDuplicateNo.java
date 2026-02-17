package practice;
import java.util.*;
public class FrequencyofDuplicateNo {
  public static void main(String[] args){
    int[] arr = {1,2,2,2,4,3,2,3,1};
    HashMap<Integer,Integer> map = new HashMap<>();
    for(int num : arr){
      map.put(num,map.getOrDefault(num,0)+1);

    }
    for(int key:map.keySet()){
      System.out.println(key + " - " + map.get(key));
    }
  }
}
