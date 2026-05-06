package binarytree;
import java.util.*;

// CODETANTRA 
// LEVEL-ORDER-TREE CONSTRUCTION
// POST-ORDER TRAVERSAL
public class PostOrderBinaryTree {

  void postOrderTraversal(Node root){
    if(root==null) return;
    Stack<Node> stack1 = new Stack<>();
    Stack<Node> stack2 = new Stack<>();
    stack1.push(root);

    System.out.println("post-order traversal");
    while(!stack1.isEmpty()){
      Node curr = stack1.pop();
      stack2.push(curr);
      if(curr.left!=null){
        stack1.push(curr.left);
      }
      if(curr.right!=null){
        stack1.push(curr.right);
      }
    }
    while(!stack2.isEmpty()){
      System.out.print(stack2.pop().data+" ");
    }
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter root element");
    int rootData = sc.nextInt();
    Node root = new Node(rootData);
    Queue<Node> q = new LinkedList<>();
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
    PostOrderBinaryTree post = new PostOrderBinaryTree();
    post.postOrderTraversal(root);
    sc.close();
  }
}
