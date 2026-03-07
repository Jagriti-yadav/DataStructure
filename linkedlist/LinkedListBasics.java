package linkedlist;

public class LinkedListBasics {
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }
  public static void main(String[] args){
    Node a = new Node(4);
    Node b = new Node(5);
    Node c = new Node(7);
    Node d = new Node(9);
    a.next = b;
    b.next = c;
    c.next = d;

    //address of node a
    System.out.println(a); 

    //address of node b
    System.out.println(a.next);
    System.out.println(b);

    //address of node c
    System.out.println(b.next);
    System.out.println(c);

    //address of node d
    System.out.println(c.next);
    System.out.println(d);
    
    //last node does not have address of any other node as there is no node after d
    System.out.println(d.next);  //null

    //data of node a
    System.out.println(a.data);
    
    //data of node b
    System.out.println(b.data);
    System.out.println(a.next.data);

    //data of node c
    System.out.println(c.data);
    System.out.println(b.next.data);

    //data of node d
    System.out.println(d.data);
    System.out.println(c.next.data);

    
  }
}
