// in this file we gonna perfrom few operaations on LinkedList.
// defenation of linked list is alredy defined in LikedList.java file.


// NOTE: HERE I TOOK "linkedListOperrations" INSTEAD OF "Node" YOU CAN ALSO TAKE Node OR ANY THING ELSE.

public class linkedListOperrations {
    // create the node and address.
    int data;
    linkedListOperrations next;
    
    // lets build a constructor.(assuming we have the next address.)
    public linkedListOperrations(int data1, linkedListOperrations next1){
        this.data = data1;
        this.next = next1;
    }

    // lets create a contrutor.( assuming we dont have next address.)
    public linkedListOperrations(int data1){
        this.data = data1;
        this.next = null; // may be there is noo next node in this case.
    }

}
// creation of linked list is done now we need to perform operations onit.lets do it in the above class.
 
class operations {
    // lets create the method to INSERT the node into linked list.
    public linkedListOperrations insert(linkedListOperrations head, int value){
        linkedListOperrations temp = new linkedListOperrations(value, head);
        return temp;
    }

    // lets write the method to delete the head of the LL.
    public linkedListOperrations deleteHead(linkedListOperrations head){
        if (head == null) return head;
        // HERE WE NEED TO UNDERSTAND SOME THING VERY IMPORTANT. WE HAVE ASSIGNED THE head TO temp VAR AND MOVED HEAD TO THE NEXT NODE.
        // AND THE NEW LL WILL START FROM THE NEW HEAD, WHERE head.neext 
        // we dont need to manually remove the temp var, cause the garbage collector will do it for us.
        linkedListOperrations temp = head; // deleted head node
        head = head.next; // new head node.
        PrintLinkedList(head); // calling the PrintLL method to print the LL.
        return head;
    }

    // lets write the code to delete the tail.
    public linkedListOperrations deleteTail(linkedListOperrations head){
        // 1st check if the head is null. if it is null OR the node next to it is null the we will retun null.
        if( head == null || head.next == null) return null;
        // assign the head to the temp.
        linkedListOperrations temp = head; // dont let the garbage collector collect your head.😂 (we need it later.)
        while (temp.next.next != null) { // we will traverse till the temp.next.next and if it is null then we will remove the temp.next
            temp = temp.next;
        }
        temp.next = null;
        PrintLinkedList(head);
        return head;
    }

    // lets find the length of the LL.
    public int lengthLL(linkedListOperrations head ){
        if( head == null) return (Integer) null;
        int count = 0;                          // we need to find the length of the LL, for the we need to coun the number of node in the LL
        linkedListOperrations temp = head;
        while (temp != null) {                 // we have to traverse the entire LL(tilll temp = null) and increment the count var.
            temp = temp.next;
            count++;
        }
        return count;
    }

    // method to find the middle Node of the sLL.
    public linkedListOperrations middleNodeofSLL(linkedListOperrations head){
        linkedListOperrations slow = head;
        linkedListOperrations fast = head;
        // linkedListOperrations temp = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        // reminder this will always retruns 2nd middle.
        return slow;
    }

    // method to find the 1st middle of the SLL.
    public linkedListOperrations FindScondMiddle(linkedListOperrations head){
        linkedListOperrations slow = head;
        linkedListOperrations fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // reminder: this method will always returns the 1st mid of SLL.
        return slow;
    }

    // search in LL
    // NOTE: TIME COMPLEXITY OF THE SEARCH MAY HIGH, (lenear Search)
    public boolean isPresent(linkedListOperrations head, int target){
        if( head == null) return false;

        linkedListOperrations temp = head;
        while (temp != null) {
            if(temp.data == target) return true;
            temp = temp.next;
        }
        return false;
    }

    // to reverse the SLL
    public linkedListOperrations ReverseSLL(linkedListOperrations head){

        if( head == null || head.next == null) return head;

        linkedListOperrations prev = null; // we need to keep track of the previous node.
        linkedListOperrations temp =  head; // we need to keep track of the current node.
        while (temp != null) {
            linkedListOperrations front = temp.next; // we need to keep track of the next node.
            temp.next = prev; // we need to reverse the link of the prev with the next of current Node.
            prev = temp; // we need to move the prev to the current node.
            temp = front;
        }
        return prev;
    }

    // method to find wheather the SLL is circular or not(loop.)
    public boolean isCircular(linkedListOperrations head){
        // To find the SLL is circular we use tontoies and hare.
        if(head == null) return false;
       
        linkedListOperrations slow = head;
        linkedListOperrations fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if( slow == fast) return true;
        }
        return false;
    }


    // Function to delete the Nth node from the end of the linked list
    public linkedListOperrations DeleteNthNodefromEnd(linkedListOperrations head, int N) {
        // Create two pointers, fastp and slowp
        linkedListOperrations fast = head;
        linkedListOperrations slow = head;

        // Move the fastp pointer N nodes ahead
        for (int i = 0; i < N; i++)
            fast = fast.next;

        // If fastp becomes null, the Nth node from the end is the head
        if (fast == null)
            return head.next;

        // Move both pointers until fastp reaches the end
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // Delete the Nth node from the end
        linkedListOperrations delNode = slow.next;
        slow.next = slow.next.next;
        delNode = null;
        return head;
    }
    // merge method.
    public linkedListOperrations merge( linkedListOperrations subSLL1, linkedListOperrations subSLL2){
        linkedListOperrations dummyNode = new linkedListOperrations(-1);
        linkedListOperrations temp = dummyNode;

        while (subSLL1 != null && subSLL2 !=null) {
            if (subSLL1.data <= subSLL2.data) {
                temp.next = subSLL1;
                subSLL1 = subSLL1.next;
            }else{
                temp.next = subSLL2;
                subSLL2 = subSLL2.next;
            }
            temp = temp.next;
        }

        if(subSLL1 != null){
            temp.next = subSLL1;
        }else{
            temp.next = subSLL2;
        }

        return dummyNode.next;
    }

    // lets sort the SLL using merge sort.
    public linkedListOperrations MergeSort(linkedListOperrations head){

        if (head == null || head.next == null) return head;

        linkedListOperrations left = head;
        linkedListOperrations middle = FindScondMiddle(head);
        linkedListOperrations right = middle.next;
        // setting the middle.next to null( to divide the SLL into 2 parts).
        middle.next = null;
        // left SLL
        left = MergeSort(left);
        // ?right SLL
        right = MergeSort(right);

        // now call the merge Fun.
        return merge(left, right);
    }

    public linkedListOperrations deleteMiddleNode(linkedListOperrations head) {
        if (head == null || head.next == null) return null; // if 0 or 1 node, return null
    
        linkedListOperrations fast = head;
        linkedListOperrations slow = head;
        linkedListOperrations prev = null;
    
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
    
        // Now slow is at the middle node, prev is before it
        prev.next = slow.next;
    
        return head;
    }

    // now lets create the method to PRINT the linked list data.
    public void PrintLinkedList(linkedListOperrations head){
        while(head!=null){
            System.out.println("data: "+ head.data);
            head = head.next;
        }
    }

    // finally lets use this operations and methods in the main method to understand its behaviour.
    public static void main(String[] args) {
        int[] arr = {0,2,4,3,5,7,1};
        int value = 100; 

        // let take the head value from the above arr.
        linkedListOperrations head = new linkedListOperrations( arr[0]);

        // this is how we assign values to the linkedlist.
        head.next = new linkedListOperrations(arr[1]);
        head.next.next = new linkedListOperrations(arr[2]);
        head.next.next.next = new linkedListOperrations(arr[3]);
        head.next.next.next.next =  new linkedListOperrations(arr[4]);
        head.next.next.next.next.next =  new linkedListOperrations(arr[5]);
        head.next.next.next.next.next.next = new linkedListOperrations(arr[6]);



        // the below is to check the isCircular method working or not.
        // head.next.next.next.next = head.next.next;

        // now insert the value using the INSERT method.
        // we need to create the obj cause the method is not static.
        operations obj = new operations(); // OBJ  of linked list has created.
        obj.insert(head,value); // Inserted.

        // now lets print the linked list data.
        System.out.println("linked List data: ");
        obj.PrintLinkedList(head); // Printed.

        // // delete the head.
        // System.out.println("after deleting the head: ");
        // obj.deleteHead(head); // deleted

        // // delete the tail
        // System.out.println("after deleting the tail: ");
        // obj.deleteTail(head);

        // // length of the LL
        // System.out.println("length of linked list: ");
        // int result = obj.lengthLL(head);
        // System.out.println("length: "+ result);

        // // find the middle Node of SLL
        // System.out.println("Middle Node of linked list: ");
        // linkedListOperrations result6 = obj.middleNodeofSLL(head);
        // System.out.println("middle Node of SLL is: "+ result6.data);

        
        // find the 1st middle Node of SLL
        // System.out.println("Middle Node of linked list: ");
        // linkedListOperrations firstmiddle = obj.FindScondMiddle(head);
        // System.out.println("middle Node of SLL is: "+ firstmiddle.data);

        // sort the SLL.
        
        System.out.println("sorted linked list: ");
        linkedListOperrations sorted = obj.MergeSort(head);
        obj.PrintLinkedList(sorted);

        // // search in the LL
        // System.out.println("Search 2 in linked list: ");
        // int target = 2;
        // boolean result2 = obj.isPresent(head, target);
        // System.out.println("is present in LL: "+ result2);

        // // to find the SLL is looped( circular).
        // System.out.println("is linked list looped: ");
        // boolean result3 = obj.isCircular(head);
        // System.out.println("is looped: "+ result3);

        // to delete the middle node.
        // System.out.println("After deleting the middle node: ");
        // linkedListOperrations result5 = obj.deleteMiddleNode(head);
        // obj.PrintLinkedList(result5);

        // to remove nth node from SLL.
        // System.out.println("Nth node is removed from SLL: ");
        // linkedListOperrations result4 = obj.DeleteNthNodefromEnd(head, 2);
        // obj.PrintLinkedList(result4);

        // reverse the SLL
        // System.out.println("After reverse the SLL: ");
        // linkedListOperrations res3 = obj.ReverseSLL(head);
        // obj.PrintLinkedList(res3);
    }
}