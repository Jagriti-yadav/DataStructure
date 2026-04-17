package linkedlist;

public class CycleDetection {
  public static Node hasCycle(Node head){
    Node slow = head;
    Node fast = head;

    while(fast!=null && fast.next!=null){
      slow = slow.next;
      fast = fast.next.next;
      if(slow==fast){
        break;
      }
    }

    //no cycle
    if(fast == null || fast.next == null){
      return null;
    }

    //find start
    slow = head;
    while(slow!=fast){
      slow=slow.next;
      fast = fast.next;
    }

    //starting node of cycle
    return slow;
  }
  public static void main(String[] args){
    Node head = new Node(1);
    head.next = new Node(2);
    head.next.next = new Node(3);
    head.next.next.next = new Node(4);
    head.next.next.next.next = new Node(5);

    //creating cycle
    head.next.next.next.next.next = head.next.next;

   System.out.println(hasCycle(head).data);
    
    
  }
}
