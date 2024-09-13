//
public class StringClass {
    public static void main(String[] args) {
        String s1="abc";
        String s2="abc";
        String s3=new String("abc");

        // if(s1==s2)   //equal
        // if (s1==s3){     //not equal   //bcz s3 is not in string pool
        if(s1.equals(s3)){   //equal   //check value 
            System.out.println("Equal");
        }
        else{
            System.out.println("not equal");
        }
    }

}
