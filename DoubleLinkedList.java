// DOUBLE LIKED LIST.

// In the realm of data structures, it's essential to grasp the intricacies of doubly linked lists. 
// These data structures are characterized by their ability to efficiently navigate in both forward and backward directions.
// Before diving into the depths of doubly linked lists, it's beneficial to recap our understanding of linked lists, and their precursor.

// the code will be same as the SLL but we have to attach the node to back like next having the address of next Node,
// this will have the adress of back node.

// the below Node is having | back | data | next |
class Node {
    
    public int data;
    public Node next;
    public Node back;

    // constructor of Node
    public Node(int data1, Node next1, Node back1){
        this.data = data1;
        this.next = next1;
        this.back = back1;
    }

    // constructor of Node (assuming there is no next node.)
    public Node(int data1){
        this.data = data1;
        this.back = null;
        this.next = null;
    }
}

public class DoubleLinkedList {

    // ?method to convet arr to DLL.
    public Node ConvettoDLL(int[] arr){
        // now convert all the ele to DLL.
        Node head = new Node(arr[0]);
        Node prev = head;

        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i], null, prev);
            prev.next = temp;
            prev = temp;
        }
        return head;
    }

    // method to insert the element at the end of the DLL
    public Node insertAtEnd(Node head, int value){
        Node newNode = new Node(value); //this is the process to create the node to insert tin the DLL.

        if(head == null) return null;

        Node temp = head;
        while( temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.back = temp;

        return head;
    }

    // method to insert at the head.
    public Node insertAthead( Node head, int value){
        // get new head
        Node newhead = new Node(value);
        
        if(head != null){
            newhead.next = head;
            head.back = newhead;
        }

        return newhead;
    }

    // method to delete the last node in the DLL
    public Node deleteTail( Node head){
        if( head == null || head.next == null) return null;

        Node temp = head;
        while (temp.next != null) { // tarverse till the end.
            temp = temp.next;
        }
        Node newTail = temp.back; // now we reached the end of the DLL, we need to get the new tail while is just back of tail.
        // now disconnect the back connection with the new tail.
        temp.back = null; // temp will be collected by garbage collector.
        newTail.next = null; // disconect the tail with the newTail with the ( now the tailNode is disconnected with both noxt and back.)  
        return head;
    }

    // lets delete the head now.
    public Node deleteHead(Node head){
        if( head == null || head.next == null) return null;

        Node temp = head.next; // temp will bbe the 2nd node.
        head.next = null;      // disconnect the head node link with the 2nd node.
        temp.back = null;      // disconnect the 2nd node link with the head node.

        return temp;
    }

    // we can reverse the DLL.
    public Node ReverseDLL(Node head){
        if( head == null || head.next == null) return null; // basic check

        Node last = null; 
        Node currentNode = head;  // this will preserve the head node.
        while(currentNode != null){ // tarversal
            last = currentNode.back;   // connecting the currentNode's back to last
            currentNode.back = currentNode.next;  // re connecting the currentNode's back to its next node.  
            currentNode.next = last;  // re connecting the currentNode's next to its back.
            // by the above operation we swaped the links (backlink to next && nextlink to back.)

            currentNode = currentNode.back; // updating the currentNode.
        }
        if (last != null) { 
            head = last.back;  // Updating the new hhead.
        }
        return head ;
    }
    // determine the middle node of the linked list. However, if the linked list has an even number of nodes, return the second middle node.
    public Node FindMiddle(Node head){
        // To find the middle of the DLL e use tontoies and hare. 
        Node slow = head;
        Node fast  = head;
        while (fast !=null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;  // this slow will become the middle of the SLL.
    }

    

    // search in DLL
    public boolean SearchinDLL(Node head, int target){
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) return true;
            temp = temp.next;
        }
        return false;
    }

    // tp print the DLL.
    public void PrintDLL(Node head){
        while(head != null){
            System.out.println("data: "+head.data);
            head = head.next;
        }
    }

    // main
    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5};

        Node head = new Node(arr[0]);
        
        DoubleLinkedList DLL = new DoubleLinkedList();
        

        // to convert the arr to DLL
        System.out.println("After converting the arr to DLL: ");
        
        // to convert the arr to DLL.
        Node dll = DLL.ConvettoDLL(arr);

        // to print the DLL
        DLL.PrintDLL(dll);

        // to insert the ele to DLL.
        Node res = DLL.insertAtEnd(dll, 6);
        System.out.println("After the insertion of last node in DLL: ");
        DLL.PrintDLL(res);
        
        // search in DLL.
        System.out.println("searching in DLL:");
        int target = 3;
        System.out.println("is ele present? 3: "+DLL.SearchinDLL(dll, target));

        // to delete the tail.
        Node ress = DLL.deleteTail(dll);
        System.out.println("after deleting the tail node: ");
        DLL.PrintDLL(ress);

        // to delete the head.
        Node resss = DLL.deleteHead(ress);
        System.out.println("After deleteing the head node: ");
        DLL.PrintDLL(resss);

        // to insert at the head.
        Node ressss = DLL.insertAthead(resss, 9);
        System.out.println("After inserting the ele at head: ");
        DLL.PrintDLL(ressss);

        // to reverse the DLL
        Node resssss = DLL.ReverseDLL(ressss);
        System.out.println("After reversing the DLL: ");
        DLL.PrintDLL(resssss);

        // to find the middle of the DLL.
        Node middle = DLL.FindMiddle(resssss);
        System.out.println("the middle Node of the DLL: ");
        System.out.println(middle.data);

    }
}
