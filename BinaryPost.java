import java.io.*;
import java.util.*;

class Node{
int key;
Node left, right;

public Node(int item)
{
key = item;
left = right = null;
}
}

class BinaryPost{
Node root;
BinaryPost(){
root = null;
}
void printPostorder(Node node){
if(node == null)
{
return;
}

printPostorder(node.left);
printPostorder(node.right);
System.out.print(node.key+" ");
    
}

public static void main(String args[])
{
BinaryPost t = new BinaryPost();
t.root = new Node(10);
t.root.left = new Node(20);
t.root.right = new Node(30);
t.root.left.left = new Node(40);
t.root.right.right = new Node(50);
t.root.right.left = new Node(60);

System.out.println("Postorder traversal of binary tree is:");
t.printPostorder(t.root);
}
}