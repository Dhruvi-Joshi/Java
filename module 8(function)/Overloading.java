public class Overloading {

    static int sum(int a,int b){
        return a+b;
    }

    static String sum(String s1,String s2){
        return s1+s2;
    }

    //method signature means method chach only name and argument type not check return type so gives error
    //thats why error show for sum(innt,int)
    // static String sum(int a,int b){
    //     return a+" "+b;
    // }

    static String sum(int a,String b){
            return a+" "+b;
        }

    public static void main(String[] args) {
        System.out.println(sum(10,12));
        System.out.println(sum("hello","world"));
        System.out.println(sum(5,"world"));

    }
    
}
