

//insertion at beginning , at last , at given position
//deletion at beginning, at last, at given node, delete given node
//find size , isEmpty , display element , displayRecursively , reverseDisplayRecursively,SplitEvenOdd

package linkedlist;

class Node{
  int data;
  Node next;
  Node(int data){
    this.data = data;
    this.next = null;
  }
}
class LinkedList1{
  Node head;
  
  //insert at end
  void insertAtEnd(int data){
    //1. create a new node
    Node newNode = new Node(data);

    //2. if list is empty
    if(head == null){
      head = newNode;
      return;
    }

    //3.if list is not empty , there are some elements in the list
    Node current = head;
    while(current.next!=null){
      current = current.next;
    }
    current.next = newNode;
  }

  

  //insert at specific position
  void insertAtPosition(int data,int pos){
    Node newNode = new Node(data);
    if(pos<0){
      System.out.println("invalid position");
      return;
    }
    if(pos==0){
      newNode.next = head;
      head = newNode;
      return;
    }
    if(head==null&&pos>0){
      System.out.println("list is empty");
      return;
    }
    Node current = head;
    for(int i=0;i<pos-1 && current!=null;i++){
      current = current.next;
    }
    if(current==null){
      System.out.println("index out of range");
      return;
    }
    newNode.next = current.next;
    current.next = newNode;
  }


  //insert at begining
  void insertAtBegin(int data){
    Node newNode = new Node(data);
    if(head == null){
      head = newNode;
      return;
    }
    newNode.next = head;
    head = newNode; 
  }

  //Display elements
  void display(){
    //when list is empty
    if(head==null){
      System.out.println("Nothing to display");
      return;
    }

    //when list is not empty
    Node current = head;
    while(current!=null){
      System.out.print(current.data+"-->");
      current = current.next;
    }
    System.out.println("null");
  }

  //isEmpty()
  boolean isEmpty(){
    return head==null;
  }

  void deleteFirst(){
    if(head==null){
      System.out.println("list is empty");
      return;
    }
    Node temp = head;
    head = head.next;
    System.out.println("deleted is :" + temp.data);
  }

  void deleteLast(){
    if(head == null){
      System.out.println("list is empty");
      return;
    }
    if(head.next==null){
      System.out.println("deleted is : "+head.data);
      head=null;
      return;
    }
    Node temp = head;
    Node prev = null;
    while(temp.next!=null){
      prev = temp;
      temp = temp.next;
    }
    prev.next = null;
    System.out.println("deleted is :"+temp.data);
    return;
  }


  //delete node by value
  void deleteByValue(int value){
    if(head == null){
      return;
    }
    if(head.data == value){
      head = head.next;
      return;
    }
    Node current = head;
    while(current.next!=null &&current.next.data!=value){
      current = current.next;
    }

    // if(current.next!=null){
    //   current.next = current.next.next;
    //   return;
    // }
    // System.out.println("value is not present");

    if(current.next == null){
      System.out.println("value is not present");
    }else {
      current.next = current.next.next;
    }
  }

  void deleteAtposition(int pos){
    if(head==null){
      System.out.println("list is empty");
      return;
    }
    if(pos<0){
      System.out.println("invalid position");
      return;
    }
    if(pos==0){
      head = head.next;
      return;
    }
    Node current = head;
    for(int i = 0;i<pos-1 && current!=null;i++){
      current = current.next;
    }
    if(current==null||current.next==null){
      System.out.println("position out of range");
      return;
    }
    Node temp = current.next;
    current.next = temp.next;
    temp = null;
  }


  //recursive call to inverse list
  void reverseDisplay(Node current){
    if( current == null){
      return;
    }
    reverseDisplay(current.next);
    System.out.print(current.data +"-->");
    
  }

  void displayRecursively(Node head){
    if(head==null){
      return;
    }
    System.out.print(head.data+"-->");
    displayRecursively(head.next);
  }

  /**************************************display method for SplitEvenOdd.java file******************************/
  void display1(Node head){
    //when list is empty
    if(head==null){
      System.out.println("Nothing to display");
      return;
    }

    //when list is not empty
    Node current = head;
    while(current!=null){
      System.out.print(current.data+"-->");
      current = current.next;
    }
    System.out.println("null");
  }
  /**********************************SPLIT METHOD FOR SplitEvenOdd.java file***********************************/
  public Node displaySplit(Node head){
    Node temp = head;
    Node tempO = null;
    Node tempE = null;

    while(temp!=null){
      if(temp.data%2==0){
        tempE.next = temp;
        tempE = temp;
        if(temp.next==null) break;
        temp = temp.next;
      }else{
        tempO.next = temp;
        tempO = temp;
        if(temp.next==null) break;
        temp = temp.next;
      }
    }
    if(head.data%2==0){
      tempO.next = head;
    }else{
      tempE.next = head;
    }
    return head;
  }
}
public class LinkedListMain {

  public static void main(String[] args){
    LinkedList1 list = new LinkedList1();
    list.insertAtBegin(23);
    list.insertAtEnd(67);
    list.insertAtBegin(56);
    list.insertAtBegin(52);
    list.insertAtPosition(12, 3);
    list.display();
    list.insertAtPosition(33,6);
    list.deleteFirst();
    list.display();
    list.deleteLast();
    list.deleteByValue(23);
    list.display();
    list.deleteByValue(0);
    list.deleteAtposition(1);
    list.display();
    
    list.insertAtBegin(2);
    list.insertAtEnd(6);
    list.insertAtBegin(5);
    list.insertAtBegin(12);
    list.display();
    list.reverseDisplay(list.head);
    System.out.println();
    list.display();
    list.displayRecursively(list.head);
    

  }
}
