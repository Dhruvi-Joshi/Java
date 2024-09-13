public class Datatype{
    public static void main(String[] args){
        char c='=';
        System.out.println(c);

        boolean bool= true;
        System.out.println(bool);

        // byte b=200;   //compiler error:incompatible type
        byte b=2;
        System.out.println(b);

        short s=10;
        System.out.println(s);

        int i=20;
        System.out.println(i);

        long l=90_000_000;  //insted of  , use _
        // long l=900000000;
        System.out.println(l);

        float f=-3.5F;    //using F its show float value
        float f=-3.5;    //error:incompatible types: possible lossy conversion from double to float
        System.out.println(f); 

        double d=4.7;
        System.out.println(d);
    }
}