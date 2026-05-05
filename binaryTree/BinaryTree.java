package binarytree;
import java.util.*;

//BINARY TREE CONSTRUCTION - Using recursion
//INORDER - recursion
//POST-ORDER - recursion
//PRE-ORDER - recursion

public class BinaryTree {

  static Scanner sc = new Scanner(System.in);

  public static Node createTree(){
    System.out.println("enter data (-1 for no node): ");
    int data = sc.nextInt();

    if(data == -1){
      return null;
    }
    Node root = new Node(data);
    System.out.println("enter left child of "+ data);
    root.left = createTree();
    System.out.println("enter right child"+data);
    root.right = createTree();

  return root;
  }

  public static void inOrder(Node root){
    if(root == null) return;
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
  }
  public static void postOrder(Node root){
    if(root==null){
      return;
    }
    postOrder(root.left);
    postOrder(root.right);
    System.out.print(root.data+" ");
  }
  public static void preOrder(Node root){
    if(root == null){
      return;
    }
    System.out.print(root.data+" ");
    preOrder(root.left);
    preOrder(root.right);
  }
  public static void main(String[] args){
    Node root = createTree();
    System.out.println("inorder : ");
    inOrder(root);
    System.out.println();
    System.out.println("preorder :");
    preOrder(root);
    System.out.println();
    System.out.println("postOrder:");
    postOrder(root);
    System.out.println();
    
  }
}
