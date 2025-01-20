public class StringEx {
    public static void main(String[] args) {
        String Name = "Yashwanth";
        String lastName = " Mallam.";
        String FullName = Name +lastName;  // to Add the 2 strings in java
        System.out.println("hello" +" "+ FullName);
        int lenght = FullName.length(); //to find the len of string
        System.out.println(lenght);
        String shortname = Name.substring(0,4);// to slice the string.
        System.out.println(shortname);
        String firsts = Name.substring(0,1); // to access the elements 
        System.out.println(firsts);

    }
}
