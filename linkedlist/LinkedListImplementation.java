package linkedlist;

class Node{
    int data ;
    Node next;

    Node(int data){
      this.data = data;
    }
  }
  class LinkedListClass{
    Node head = null;
    Node tail = null;
    int size = 0;
    void insertAtFirst(int data){
      Node newNode = new Node(data);
      if(head == null){
        tail = newNode;
        //we can also call insertAtEnd function here if head == null
      }else{
        newNode.next = head;
      }
      head = newNode;
      size++;
    }
    void insertAtEnd(int data){
      Node newNode = new Node(data);
      if(head == null){
        head = newNode;
        //we can call insertAtfirst function here
      }else{
        tail.next = newNode;
      }
      tail = newNode;
      size++;
    }
    void insertAtPosition(int idx , int data){
      Node newNode = new Node(data);
      Node temp = head;
      if(idx<0 || idx>size){
        insertAtFirst(data);
      }
       for(int i = 1;i<=idx-1;i++){
        temp = temp.next;
       }
       newNode.next = temp.next;
       temp.next = newNode;
       size++;
    }
    // public int size(){
    //   int count = 0;
    //   Node temp = head;
    //   while(temp!=null){
    //     temp = temp.next;
    //     count++;
    //   }
    //   return count;
    // }

    public int getElement(int idx){
      Node temp = head;
      if(idx<1||idx>size){
        return -1;
      }
      for(int i = 1; i<idx;i++){
        temp = temp.next;
      }
      return temp.data;
    }

    public void deleteAt(int idx){
      Node temp = head;
      if(idx==0){
        head = head.next;
        size--;
        return;
      }
      if(idx<0||idx>size){
        System.out.println("Invalid index");
        return;
      }
      for(int i = 1; i<=idx-1;i++){
        temp = temp.next;
      }
      temp.next=temp.next.next;
      size--;
    }

    void displayList(){
      Node current = head;
      while(current!=null){
        System.out.print(current.data+"-->");
        current = current.next;
      }
    }

  }
public class LinkedListImplementation{
  public static void main(String[] args){
    LinkedListClass list = new LinkedListClass();
    list.insertAtEnd(4);
    list.insertAtEnd(5);
    list.insertAtFirst(3);
    list.insertAtPosition(3,17);
    list.displayList();
    System.out.println();

    // System.out.println("Size of linked list is "+list.size());

    System.out.println("Size of linked list is "+list.size);

    System.out.println("Element at given index is "+list.getElement(1));
    list.deleteAt(2);
    list.displayList();
    list.deleteAt(0);
    System.out.println();
    list.displayList();
    System.out.println();
    list.deleteAt(3);
  }
}