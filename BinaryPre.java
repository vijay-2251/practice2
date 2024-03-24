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

class BinaryPre{
Node root;
BinaryPre(){
root = null;
}
void printPreorder(Node node){
if(node == null)
{
return;
}
System.out.print(node.key+" ");
printPreorder(node.left);
printPreorder(node.right);
}

public static void main(String args[])
{
BinaryPre t = new BinaryPre();
t.root = new Node(10);
t.root.left = new Node(20);
t.root.right = new Node(30);
t.root.left.left = new Node(40);
t.root.right.right = new Node(50);
t.root.right.left = new Node(60);

System.out.println("Preorder traversal of binary tree is:");
t.printPreorder(t.root);
}
}