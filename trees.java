// PROBLEM STATEMENT : Binary Search Tree (BST) AND ALL BASIC OPERATIONS ON IT.

// This code defines a simple binary tree structure in Java.
// lets try to understand how to create a tree and its nodes in Java.
// A binary search tree is just a structure where each node has at most 2 children (no ordering rules).

// A binary search tree (BST) adds the ordering property:

// Left child < Parent < Right child.

// Your insertRec method enforces this ordering.

// Traversals (inOrder, preOrder, postOrder, levelOrder) are just ways to read the tree, not what defines it.
// Example from your insertions:

// 1 → root
// 2 < 1 → goes left
// 3 > 1 → goes right
// 4 > 1 → goes right of 1 → right of 3
// 5 > 4 → goes right of 4
// 6 > 5 → goes right of 5
// 7 > 6 → goes right of 6

import java.util.LinkedList;
import java.util.Queue;

class Nodee{
    public int data;
    public Nodee left;
    public Nodee right;

    // constructor to initialize the node with data
    // and set left and right children to null automatically when a new node is created with out the left and right parameters
    public Nodee( int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // constructor to initialize the node with data and left and right children
    public Nodee(int data, Nodee left, Nodee right){
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

// lets create a tree class to manage the nodes and perform operations on the tree.

public class trees {

    // let's create a root node for the tree
    Nodee root;
    // contructor of tree class
    public trees() {
        root = new Nodee(1);
        root.left = new Nodee(2);
        root.right = new Nodee(3);
    }

    // method to print the tree in pre-order traversal
    // traversal is done using recursion(a func which calls itself).
    // LEMME GIVE YOU A SHORTCUT TO IMPLEMENTS AND REMEMBER PREORDER TRAVERSAL
    // FOR PREORDER : ROOT -> LEFT -> RIGHT
    public void preOrder(Nodee node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    // method to print the tree in in-order traversal
    // FOR INORDER : LEFT -> ROOT -> RIGHT
    public void inOrder(Nodee node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
    }

    // moethod to print the tree in post-order traversal
    // FOR POSTORDER : LEFT -> RIGHT -> ROOT
    public void postOrder(Nodee node) {
        if (node == null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
    }

    // level order traversal using a queue.
    public void LevelOrderTraversal(Nodee root){
        if (root == null) return;

        Queue<Nodee> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Nodee current = queue.poll();
            System.out.print(current.data + " ");
            if (current.left != null) {
                queue.add(current.left);
            }
            if (current.right != null) {
                queue.add(current.right);
            }
        }
    }

    // method to insert a new node in the tree
    public Nodee insertRec(Nodee rootNode, int data) {
        if (rootNode == null) {
            rootNode = new Nodee(data);
            return rootNode;
        }
        if (data < rootNode.data) {
            rootNode.left = insertRec(rootNode.left, data);
        } else if (data > rootNode.data) {
            rootNode.right = insertRec(rootNode.right, data);
        }
        return rootNode;    
    }

    // search for a node in the tree
    public boolean searchNode(Nodee root,int data){
        if(root == null){
            return false; // if the data is not found
        }else if(root.data == data){
            return true;
        }else if(data > root.data){
            return searchNode(root.right, data);
        }else if(data < root.data){
            return searchNode(root.left, data);
        }
        return false; // if the data is not found
    }
    
    // 
    public int lenghtOftree(Nodee root){

        if(root ==null) return 0;

        int count = 0;
        while(root.left != null && root.right != null){
            count++;
            lenghtOftree(root.left);
            lenghtOftree(root.right);
        }
        return count;
    }


    // mwthod to delete the node from the tree
    // public Nodee deleteNode(Nodee root, int data) {
    //     if(root == null) return root; // if the tree is empty
    //     if(data < root.data) {
    //         r
    //     }
    //  }

    

    // main method to test the tree
    public static void main(String[] args) {
        // creating a new tree object
        trees myTree = new trees();

        // inserting a new node in the tree
        myTree.insertRec(myTree.root, 4);
        myTree.insertRec(myTree.root, 5);
        myTree.insertRec(myTree.root, 6);
        myTree.insertRec(myTree.root, 7);
        System.out.println("\nAfter inserting , pre-order traversal of the tree:");
        myTree.preOrder(myTree.root);

        // to print the tree in pre-order traversal
        System.out.println();
        System.out.println("Pre-order traversal of the tree:");
        myTree.preOrder(myTree.root);

        // to print the tree in in-order traversal
        System.out.println("\nIn-order traversal of the tree:");
        myTree.inOrder(myTree.root);

        // to print the tree in post-order traversal
        System.out.println("\nPost-order traversal of the tree:");
        myTree.postOrder(myTree.root);
        System.out.println();
        // searching for a node in the tree
        System.out.println("this is searching for a node 6 in the tree:");
        int searchValue = 6;
        boolean found = myTree.searchNode(myTree.root, searchValue);
        if (found) {
            System.out.println("Node with value " + searchValue + " found in the tree.");
        } else {
            System.out.println("Node with value " + searchValue + " not found in the tree.");
        }

        // to print the level order traversal of the tree
        System.out.println("Level order traversal of the tree:");
        myTree.LevelOrderTraversal(myTree.root);

        // to print the lenght of the tree
        System.out.println("\nLenght of the tree is : " + myTree.lenghtOftree(myTree.root));

    }

}