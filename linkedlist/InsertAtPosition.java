package linkedlist;
import java.util.*;
class Node{
  int data;
  Node next;
}
class LinkedList{
  Node head = null;

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

  public void insertAtLast(int data){
    Node newNode = new Node();
    newNode.data = data;
    newNode.next = null;

    if(head==null){
      insertAtFirst(data);
      return;
    }
    Node current = head;
    while(current.next!=null){
      current = current.next;
    }
    current.next = newNode;
  }
  public void insertAtPosition(int data,int idx){

    //note - 0 based indexing 

    //Invalid position if idx is less than 1
    if(idx<1){
      System.out.println("Invalid position");
      return;
    }

    Node newNode = new Node();
    newNode.data = data;
    //if index is 1
    if(idx==1){
      newNode.next = head;
      head = newNode;
      return;
    }

    if(head==null&&idx>1){
      System.out.println("List is empty, insertion is not possible");
      return;
    }

    Node current = head;
    int count = 1;
    while(count<idx-1 && current!=null){
      current = current.next;
      count++;
    }
    if(current==null){
      System.out.println("position is out of range");
      return;
    }
    newNode.next = current.next;
    current.next = newNode;
  }
  public void display(){
    Node temp = head;
    if(temp == null){
      System.out.println("nothing to display");
    }
    while(temp!=null){
      System.out.print(temp.data+"-->");
      temp = temp.next;
    }
    System.out.println();
  }
}

public class InsertAtPosition {
  public static void main(String[] args){
    LinkedList list = new LinkedList();

    Scanner sc = new Scanner(System.in);
    int option , x;
    while(true){
      System.out.println("1.Insert at first\n2.Insert At end\n3.Insert at given position\n4.Display\n5.exit");
      System.out.println("enter your choice:");
      option = sc.nextInt();

      switch(option){
        case 1:
          System.out.println("enter data");
          x = sc.nextInt();
          list.insertAtFirst(x);
          break;
        case 2:
          System.out.println("enter data");
          x = sc.nextInt();
          list.insertAtLast(x);
          break;
        case 3:
          System.out.println("enter data");
          x = sc.nextInt();
          System.out.println("enter position");
          int y=sc.nextInt();
          list.insertAtPosition(x,y);
          break;
        case 4:
          list.display();
          break;
        case 5:
          sc.close();
          return;

      }
    }
  }
}
