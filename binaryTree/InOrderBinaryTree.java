package binarytree;
import java.util.*;

// CODETANTRA 
// LEVEL-ORDER-TREE CONSTRUCTION
// INORDER TRAVERSAL

class Node{
  int data;
  Node left,right;
  Node(int data){
    this.data = data;
    left = null;
    right = null;
  }
}

public class InOrderBinaryTree {

  void inOrderTraversal(Node root){
    Stack<Node> stack = new Stack<>();
    Node curr = root;
    System.out.println("inorder traversal");
    while(curr!=null || !stack.isEmpty()){
      if(curr!=null){
        stack.push(curr);
        curr = curr.left;
      }else{
        curr = stack.pop();
        System.out.print(curr.data+" ");
        curr = curr.right;
      }
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    //input root data
    System.out.println("enter the root node:");
    int rootData = sc.nextInt();

    //creating root node
    Node root = new Node(rootData);

    //creating queue to store nodes and their child
    Queue<Node> q = new LinkedList<>();

    //adding root in the queue
    q.add(root);

    while(!q.isEmpty()){
      Node curr = q.poll();
      int leftData = sc.nextInt();
      if(leftData!=-1){
        curr.left = new Node(leftData);
        q.add(curr.left);
      }
      int rightData = sc.nextInt();
      if(rightData!=-1){
        curr.right = new Node(rightData);
        q.add(curr.right);
      }
    }


    InOrderBinaryTree tree = new InOrderBinaryTree();
    tree.inOrderTraversal(root);
    sc.close();

  }
}
