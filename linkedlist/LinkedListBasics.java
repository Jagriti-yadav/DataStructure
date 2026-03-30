package linkedlist;

public class LinkedListBasics {
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
    }
  }

  //display elements through method
  public static void Display(Node head){
    Node temp = head;
    while(temp!=null){
    System.out.print(temp.data + " ");
    temp = temp.next;
    }
  }

  //display through recursive function
  public static void displayRecursive(Node head){
    //base case
    if(head==null) return;
    System.out.print(head.data+" ");
    displayRecursive(head.next);
  }
  
  //reverse linkedlist
  public static void displayReverseLinkedList(Node head){
    if(head==null){
      return;
    }
    displayReverseLinkedList(head.next);
    System.out.print(head.data+" ");
  }

  //length of linkedlist
  public static int length(Node head){
    int count = 0;
    while(head!=null){
      count++;
      head = head.next;
    }
    return count;
  }

  public static void insertAtEnd(Node head,int val){
    Node temp = new Node(5);
    Node t = head;
    while(t.next!=null){
      t = t.next;
    }
    t.next = temp;
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

    //displaying list elements (by creating temp node and then keep changing its address to next node)
    //Node temp = a;
    // for(int i = 0;i<=3;i++){
    //   System.out.print(temp.data+" ");
    //   temp = temp.next;
    // }

    //displaying using while loop
    // while(temp!=null){
    //   System.out.print(temp.data + " ");
    //   temp = temp.next;
    // }

    //display list element using method
    Display(a);
    System.out.println();
    //displaying elements recursively
    displayRecursive(a);
    System.out.println();
    System.out.println("length of the string is "+length(a));
    displayReverseLinkedList(a);
    System.out.println();
    insertAtEnd(a,5);
    displayRecursive(a);
  }
}
