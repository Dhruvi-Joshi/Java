public class Type{
    public static void main(String[] args){

        //smaller to larger =widening type casting
        int i =20;
        long l =i;
        System.out.println(l);

        //larger data type tp smaller data type =explicit type casting

        long a= 1000000;
        int b=(int)a;
        System.out.println(b);

        int x=2000;
        byte y=(byte)x;
        System.out.println(y);  //-48 //its not give perfect conversion itsw called lossy conversion bcz our data is loss
    }
}