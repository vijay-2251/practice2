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

class BT{
Node root;
BT(){
root = null;
}
void printInorder(Node node){
if(node == null)
{
return;
}
printInorder(node.left);

System.out.print(node.key+" ");

printInorder(node.right);
}

public static void main(String[] args)
{
BT t = new BT();
t.root = new Node(10);
t.root.left = new Node(20);
t.root.right = new Node(30);
t.root.left.left = new Node(40);
t.root.right.right = new Node(50);
t.root.right.left = new Node(60);

System.out.println("Inorder traversal of binary tree is:");
t.printInorder(t.root);
}
}