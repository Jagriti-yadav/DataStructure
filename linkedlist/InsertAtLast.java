package linkedlist;
import java.util.Scanner;

class Node{
  int data;
  Node next;
}
class LinkedList{
  Node head = null;

  boolean isEmpty(){
    return (head==null);
  }
  void insertAtFirst(int data){
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
  void insertAtLast(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    Node current = head;
    if(head == null){
      insertAtFirst(data);
      return;
    }
    while(current.next!=null){
      current = current.next;
    }
    current.next = newNode;
  }

  void displayList(){
    Node current = head;
    if(current==null){
      System.out.println("Nothing to display");
    }
    while(current!=null){
      System.out.print(current.data+" ");
      current = current.next;
    }
    System.out.println();
  }
}

public class InsertAtLast {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    LinkedList list = new LinkedList();

    int op;
    while(true){
      System.out.println("1.Insert at front\n2.Insert At Last\n3.Display\n4.Exit");
      op = sc.nextInt();
      switch(op){
        case 1:
          System.out.println("Enter data:");
          int a = sc.nextInt();
          list.insertAtFirst(a);
          break;
        case 2:
          System.out.println("Enter data:");
          int b = sc.nextInt();
          list.insertAtLast(b);
          break;
        case 3:
          list.displayList();
          break;
        case 4:
          sc.close();
          return;
      }
    }
    
  }

  
}
