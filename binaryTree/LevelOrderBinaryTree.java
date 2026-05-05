package binarytree;
import java.util.*;
//LEVEL ORDER TRAVERSAL IN BINARY TREE
//SIZE OF THE BINARY TREE
public class LevelOrderBinaryTree {

  /**********************************Level Order Traversal***************************************/
  public static void levelOrderTraversal(Node root){
    Queue<Node> q = new LinkedList<>();
    if(root!=null){
      q.add(root);
    }

    System.out.println("level order traversal");
    while(q.size()>0){
      Node curr = q.peek();
      if(curr.left!=null) q.add(curr.left);
      if(curr.right!=null) q.add(curr.right);
      System.out.print(curr.data+" ");
      q.remove();
    }
  }

  /*************************************** Size of the tree ***********************************/
  public static int treeSize(Node root){
    if(root == null) return 0;
    return 1 + treeSize(root.left) + treeSize(root.right);
  }

  /*********************************** Max Node value in the tree ********************************/
  public static int max(Node root){
    if(root==null) return 0;
    int a = root.data;
    int b = max(root.left);
    int c = max(root.right);
    return Math.max(a,Math.max(b,c));
  }

 /************************************* Height of the tree **********************************/
  public static int height(Node root){
    if(root == null) return 0;
    return 1+ Math.max(height(root.left),height(root.right));
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the root element");
    int rootData = sc.nextInt();
    Node root  = new Node(rootData);
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
    //LevelOrderBinaryTree bfs = new LevelOrderBinaryTree();
    levelOrderTraversal(root);
    System.out.println();
    int size = treeSize(root);
    System.out.println("size of the tree is : "+size);
    System.out.println("max node in the tree is : "+max(root));
    System.out.println("height of the tree is : "+height(root));

    sc.close();
  }
}
