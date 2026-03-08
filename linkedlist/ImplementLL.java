package linkedlist;

public class ImplementLL {
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static class LinkedList{
    Node head = null;
    Node tail = null;
    void insertAtEnd(int data){
      Node temp = new Node(data);
      if(head==null){
        head = temp;
      }else{
        tail.next = temp;
      }
      tail = temp;
    }
    void display(){
    Node temp = head;
    while(temp!=null){
      System.out.println(temp.data);
      temp = temp.next;
    }
  }
  }
  
  public static void main(String[] args){
    LinkedList ll = new LinkedList();
    ll.insertAtEnd(4);
    ll.insertAtEnd(5);
    ll.insertAtEnd(7);
    ll.display();
  }
}
