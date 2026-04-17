package linkedlist;

class DDNode{
  int data;
  DDNode next;
  DDNode prev;
  DDNode(int data){
    this.data = data;
  }
}
class DoublyLinked{
  DDNode head;
  boolean searchElement(DDNode head,int target){
    DDNode temp = head;
    while(temp!=null){
      if(temp.data == target){
        return true;
        
      }
      temp = temp.next;
    }
    return false;
  }
  int size(DDNode head){
    
    int count = 0;
    DDNode temp = head;
    while(temp!=null){
      count++;
      temp=temp.next;
    }
    return count;
  }
  void reversePrint(DDNode head){
    if(head==null){
      return;
    }
    reversePrint(head.next);
    System.out.print(head.data+"-->");
  }
}
public class DoublyLinkedList {
  public static void main(String[] args){
    DoublyLinked dd = new DoublyLinked();
    DDNode a = new DDNode(5);
    DDNode b = new DDNode(15);
    DDNode c = new DDNode(25);
    DDNode d = new DDNode(35);
    DDNode e = new DDNode(45);
    a.next = b;
    b.prev = a;
    b.next = c;
    c.prev = b;
    c.next = d;
    d.prev = c;
    d.next = e;
    e.prev = d;
    System.out.println(dd.searchElement(a,40));
    System.out.println(dd.size(a));
    dd.reversePrint(a);
  }
}
