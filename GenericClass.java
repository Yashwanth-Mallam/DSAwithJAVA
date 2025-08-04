// GENERIC CLASS EXAMPLE.

// A generic class in Java is a class that is defined with one or more type parameters. 
// These type parameters act as placeholders for actual data types, which are specified when an instance of the class is created. 
// This allows the class to "work with various data types" without requiring separate implementations for each type.

import java.util.Scanner;

public class GenericClass <Type> {
    Type data1;
    Type data2;

    // this is the contructor of the generic class.
    public GenericClass(Type data1, Type data2) {
        this.data1 = data1;
        this.data2 = data2;
    }

    // to access the data of generic 
    public Type GetData(){
        System.out.println("Get method acessed: ");
        return data1;
    }

    // to print the generic data.
    public void PrintData( Type data1, Type data2){
        System.out.println("data1: "+data1);
        System.out.println("data2: "+ data2);
    }

    // Helper method to sum integers
    private int sumOfData(int data1, int data2) {
        return data1 + data2;
    }

    // Helper method to concatenate strings
    private String concatStrings(String data1, String data2) {
        return data1 + data2;
    }

    // Main generic operation method
    public Object ADD(Type data1, Type data2) {
        if (data1 instanceof Integer && data2 instanceof Integer) {
            return sumOfData((Integer) data1, (Integer) data2);
        } else if (data1 instanceof String && data2 instanceof String) {
            return concatStrings((String) data1, (String) data2);
        } else {
            return "Unsupported types for ADD operation.";
        }
    }
}

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the data: ");
        int data1 = sc.nextInt();
        int data2 = sc.nextInt();

        // lets create the obj of generic class of int.
        GenericClass<Integer> obj = new GenericClass<>(data1,data2);
        // to prin the data.
        obj.PrintData(data1, data2);
        // to access the data.
        Integer data = obj.GetData();
        System.out.println("data we got: "+data);
        // to add the int data.
        System.out.println("int data: "+obj.ADD(10, 20));
        
        // we have to create the new Generic class to string.
        GenericClass<String> obj2 = new GenericClass<>("Hello ", "World!");
        System.out.println("String data: "+obj2.ADD("Yash", "wanth"));
        
        sc.close();
    }
}
