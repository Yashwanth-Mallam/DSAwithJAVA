// Problem statement: Implement a stack using an array.

// Note: Stack is a data structure that follows the Last In First Out (LIFO) rule

public class ImplementStackusingArr {
    public static void main(String[] args) {
        // lets create the obj
        stack st = new stack();
        int[] arr = {1,2,3,4};

        st.push(arr[0]);
        st.push(arr[2]);
        st.push(arr[3]);
        System.out.println("Top of the stack before deleting any element " + st.top());
        System.out.println("Size of the stack before deleting any element " + st.size());
        System.out.println("The element deleted is " + st.pop());
        System.out.println("Size of the stack after deleting an element " + st.size());
        System.out.println("Top of the stack after deleting an element " + st.top());
    }
}

// implementing the stack
class stack{
    int size = 10000;
    int top = -1;
    int[] arr = new int[size];

    // for the push operation
    public void push(int x){
        top++;
        arr[top] = x;
    }

    // for the top operation
    public int top(){
        return top;
    }

    // for the pop operation
    public int pop(){
        int x = arr[top];
        top--;
        return x;
    }

    // for the isempty operation
    public boolean isempty(){
        if(top ==-1) return true;
        return false;
    }

    // for the size operation
    public int size(){
        return top+1;
    }
}
