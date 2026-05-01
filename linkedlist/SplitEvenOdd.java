package linkedlist;

public class SplitEvenOdd {
  public static void main(String[] args){
    LinkedList1 list = new LinkedList1();
    Node a = new Node(10);
    Node b = new Node(4);
    Node c = new Node(1);
    Node d = new Node(2);
    Node e = new Node(3);
    Node f = new Node(5);
    Node g = new Node(7);
    a.next = b;
    b.next = c;
    c.next = d;
    d.next = e;
    e.next = f;
    f.next = g;
    list.display1(a);
    list.displaySplit(a);

  }
}
