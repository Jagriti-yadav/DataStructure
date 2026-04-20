package binaryTree;
import java.util.*;
class Node{
  int data;
  Node left , right;
  Node(int data){
    this.data = data;
  }
}
public class BinarySearchTree {
  static Node buildBST(Vector<Integer> v){
    Node root = null;
    for(int n : v){
      root = insert(root,n);
    }
    return root;
  }
  static Node insert(Node root,int val){
    if(root==null) return new Node(val);
    if(val<root.data){
      root.left = insert(root.left,val);
    }else if(val>root.data){
      root.right = insert(root.right,val);
    }
    return root;
  }
  static void inOrder(Node root){
    if(root == null){
      return;
    }
    inOrder(root.left);
    System.out.print(root.data+" ");
    inOrder(root.right);
  }
  static boolean searchElement(Node root,int key){
    if(root == null){
      return false;
    }
    if(root.data==key){
      return true;
    }
    if(key<root.data){
      return searchElement(root.left, key);
    }else{
      return searchElement(root.right, key);
    }
  } 

  //finds min value in bst
  static Node findInorderSuccessor(Node root){
    while(root.left!=null){
      root = root.left;
    }
    return root;
  }
  //find max element in the tree
  static Node findMax(Node root){
    while(root.right!=null){
      root = root.right;
    }
    return root;
  }
  static Node delete(Node root, int key){
    //base case - when tree has no node
    if(root == null){
      return null;
    }
    if(key<root.data){
      root.left = delete(root.left,key);
    }else if(key>root.data){
      root.right = delete(root.right,key);
    }else{
      //when root.data == key
      //case 1 & 2 - when that node has no child or one child
      if(root.left==null) return root.right;
      else if(root.right==null) return root.left;
      //case 3 - when node has two child
      else{
        //find inOrder successor of that node
        Node temp = findInorderSuccessor(root.right);
        root.data = temp.data;
        root.right = delete(root.right,temp.data);
      }
    }
    return root;
  }
  static int sizeOfTree(Node root){
    if(root == null){
      return 0;
    }
    return 1+sizeOfTree(root.left)+sizeOfTree(root.right);
  }

  static int height(Node root){
    if(root==null) return 0;
    return 1 + Math.max(height(root.left),height(root.right));
  }

  static int depth(Node root,int target,int depth){
    //base case - when root becomes null
    if(root == null){
      return -1;
    }
    if(root.data == target){
      return depth;
    }
    int left = depth(root.left,target,depth+1);
    if(left != -1){
      return left;
    }
    return depth(root.right,target,depth+1);
  }
  static int getDepth(Node root,int target){
    return depth(root,target,0);
  }

  static void nthLevel(Node root,int n){
    if(root == null || n<=0) return;
    if(n == 1){
      System.out.print(root.data+" "); 
      return;
    }
    nthLevel(root.left, n-1);
    nthLevel(root.right, n-1);

  }
  static void bfs(Node root){
    Queue<Node> q = new LinkedList<>();
    if(root!=null){
      q.add(root);
    }
    while(q.size()>0){
      Node temp = q.peek();
      if(temp.left!=null) q.add(temp.left);
      if(temp.right!=null) q.add(temp.right);
      System.out.print(temp.data+ " ");
      q.remove();
    }
  }
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Vector<Integer> v = new Vector<>();
    System.out.println("enter elements (-1 for stop): ");
    int i = 0;
    while(i>=0){
      int n = sc.nextInt();
      if(n==-1){
        break;

      }
      v.add(n);
    }
    Node root = buildBST(v);
    inOrder(root);
    System.out.println();
    System.out.println(searchElement(root, 8));
    // delete(root,4);
    // inOrder(root);
    // System.out.println();
    Node minValue = findInorderSuccessor(root);
    System.out.println("minimum value in the tree");
    System.out.println(minValue.data);
    System.out.println("max value");
    System.out.println(findMax(root).data);
    System.out.println("size of the tree");
    System.out.println(sizeOfTree(root));
    System.out.println("height of the tree");
    System.out.println(height(root));
    System.out.println("depth of the tree");
    System.out.println(getDepth(root, 6));
    System.out.println("nodes at 1 level");
    nthLevel(root, 1);
    System.out.println();
    System.out.println("nodes at 2 level");
    nthLevel(root, 2);
    System.out.println();
    System.out.println("nodes at 3 level");
    nthLevel(root, 3);
    System.out.println();
    System.out.println("level order traversal");
    bfs(root);
    sc.close();
  }
}
