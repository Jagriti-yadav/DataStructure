package linkedlist;
import java.util.*;

//CODETANTRA - INSERT AT FIRST POSITION IN LINKEDLIST - {WITHOUT MAINTAINING TAIL}

class Node{
  int data;
  Node next;
}
class LinkedList{
  private Node head;
  public boolean isEmpty(){
    return (head == null);
  }
  public void insertAtFirst(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;
    if(head==null){
      head = newNode;
    }else{
      newNode.next = head;
      head = newNode;
    }
  }
  public void displayList(){
    Node currentNode = head;
    if(currentNode == null){
      System.out.println("Nothing to display");
    }
    while(currentNode!=null){
      System.out.print(currentNode.data+"-->");
      currentNode = currentNode.next;
    }
    System.out.println();
  }
}

public class InsertAtFirst{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();
    int op ;
    while(true){
      System.out.println("1.Insert At Front\n2.Display\n3.Exit");
      System.out.println("Enter your option");
      op = sc.nextInt();

      switch(op){
        case 1 : 
          System.out.println("Enter data : ");
          int a = sc.nextInt();
          list.insertAtFirst(a);
          break;
        case 2:
          list.displayList();
          break;
        case 3:
          sc.close();
          return;
      }
    }
  }
}

