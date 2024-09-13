public class Methods {
    public static void main(String[] args) {
        String s="Hello world";
        String s2=new String("Hello world");
        System.out.println(s);


        System.out.println(s.charAt(3));


        System.out.println(s.length());


        System.out.println(s.indexOf("ll"));   //2
        System.out.println(s.indexOf("llw"));   //-1
        System.out.println(s.indexOf("l"));  //2 first ocurence


        System.out.println(s==s2);   //false
        System.out.println(s2.equals(s));   //true


        System.out.println(s.contains("Hello"));  //true
        System.out.println(s.contains("abc"));  //false

        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        System.out.println(s.replace("Hello", "bye"));
        String one="I love programming.programming is awesome";
        System.out.println(one.replace("programming", "java")); //replace all programming

        String sub=one.substring(7);
        System.out.println(sub);
        String sub1=one.substring(7,18);  //end index-1
        System.out.println(sub1);

        //concatenation

        String a1="Hello";
        String a2="world";
        int a=5;
        System.out.println(a1+a2);
        System.out.println(a2+a);
        System.out.println(a+a2);
        

    }
    
}
