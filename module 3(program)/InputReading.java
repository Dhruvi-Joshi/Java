import java.util.*;

public class InputReading{
    public static void main(String[] args){
        // System.out.println("hi");
        Scanner sc= new Scanner(System.in);
        // int x=sc.nextInt();
        // byte b=sc.nextByte();
        // long l=sc.nextLong();
        // short s=sc.nextShort();
        // System.out.println(x*x);

        // String str=sc.next();     //hello world  //only print hello
        // String st=sc.nextLine();
        // System.out.println(st);  

        // boolean bool=sc.nextBoolean();  //only true & false 
        // System.out.println(bool);

        //only for single character

        char c= sc.next().charAt(3);  //next()=read a string  ,charat()->return 0 char
        System.out.println(c);
    }
}