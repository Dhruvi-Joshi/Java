//heap memory have string pool

//String is an example of an immutable type. A String object always represents the same string.

//Since String is immutable, once created, a String object always has the same value. To add something to the end of a String, you have to create a new String object:

//ex: a="abc",string b="abc" than abc is in string pool and a &b variable is object of abc

public class String1{
    public static void main(String[] args){
        String s= "abc";
        System.out.println(s);  
        s="hello";      
        System.out.println(s);  
        String s4=new String("java");   //it's store in heap memory not in string
    }
}