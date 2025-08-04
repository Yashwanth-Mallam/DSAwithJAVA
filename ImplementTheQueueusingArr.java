// Problem Statement: Implement Queue Data Structure using Array with all functions like pop, push, top, size, etc.

// Example:

// Input: push(4)
//        push(14)
//        push(24)
//        push(34)
//        top()
//        size()
//        pop()

// Output: 

// The element pushed is 4
// The element pushed is 14
// The element pushed is 24
// The element pushed is 34
// The peek of the queue before deleting any element 4
// The size of the queue before deletion 4
// The first element to be deleted 4
// The peek of the queue after deleting an element 14
// The size of the queue after deleting an element 3

public class ImplementTheQueueusingArr {
    public static void main(String[] args) {
        Queue q = new Queue(6);
        q.push(4);
        q.push(14);
        q.push(24);
        q.push(34);
        System.out.println("The peek of the queue before deleting any element " + q.top());
        System.out.println("The size of the queue before deletion " + q.size());
        System.out.println("The first element to be deleted " + q.pop());
        System.out.println("The peek of the queue after deleting an element " + q.top());
        System.out.println("The size of the queue after deleting an element " + q.size());
    }
}

// implementing the queue.
class Queue{
    
    private int arr[];
    private int start, end, currSize, maxSize;
    // contructor 1
    public Queue() {
        arr = new int[16];
        start = -1;
        end = -1;
        currSize = 0;
    }
    // costructor 2
    public Queue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        start = -1;
        end = -1;
        currSize = 0;
    }
    // to push.
    public void push(int newElement) {
        if (currSize == maxSize) {
            System.out.println("Queue is full\nExiting...");
            System.exit(1);
        }
        if (end == -1) {
            start = 0;
            end = 0;
        } else
            end = (end + 1) % maxSize;
        arr[end] = newElement;
        System.out.println("The element pushed is " + newElement);
        currSize++;
    }
    // to remove
    public int pop() {
        if (start == -1) {
            System.out.println("Queue Empty\nExiting...");
            System.exit(1);
        }
        int popped = arr[start];
        if (currSize == 1) {
            start = -1;
            end = -1;
        } else
            start = (start + 1) % maxSize;
        currSize--;
        return popped;
    }
    // to know the top
    public int top() {
        if (start == -1) {
            System.out.println("Queue is Empty");
            System.exit(1);
        }
        return arr[start];
    }
    // to kow the size.
    public int size() {
        return currSize;
    }
    
}