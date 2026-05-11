package binarytree;
import java.util.*;

// CODETANTRA 
// LEVEL-ORDER-TREE CONSTRUCTION
// PRE-ORDER TRAVERSAL
public class PreOrderBinaryTree {

  void PreOrderTraversal(Node root){
    Stack<Node> stack = new Stack<>();
    Node curr = root;

    System.out.println("preorder traversal");
    while(curr!=null || !stack.isEmpty()){
      if(curr!=null){
        System.out.print(curr.data+" ");
        stack.push(curr);
        curr = curr.left;
      }else{
        curr = stack.pop();
        curr = curr.right;
      }
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
      if(rightData !=-1){
        curr.right = new Node(rightData);
        q.add(curr.right);
      }  
    }
    PreOrderBinaryTree pre = new PreOrderBinaryTree();
    pre.PreOrderTraversal(root);
    sc.close();
  }
}
