// What is a Linked List?
// It is a linear data structure that can be visualized as a chain with different nodes connected, where each node represents a different element. 
// The difference between arrays and linked lists is that, unlike arrays, the elements are not stored at a contiguous location.
// Since for any element to be added in an array, we need the exact next memory location to be empty, and it is impossible to guarantee that 
// it is possible. Hence adding elements to an array is not possible after the initial assignment of size.
// There are four main types of linked lists: singly linked lists, doubly linked lists, circular linked lists, and circular doubly linked lists. 
// we are only discussing singly linked list.

public class LinkedList {

    int data; // The data stored in the node
    LinkedList next; // The next node in the linked list

    // contructor
    public LinkedList(int data1, LinkedList next1) {
        this.data = data1; // Assign the data to the node
        this.next = next1; // Assign the next node to the node
    }

    // main
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        LinkedList head = new LinkedList(arr[0], null); // Create the head node with the first element of the array.
        System.out.println(head.data); // Print the data of the head node.
        // to print the next.
        System.out.println(head.next); // Print the next node of the head node.
    }

}