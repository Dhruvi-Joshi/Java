import java.math.BigInteger;
public class Biginteger {

    public static void main(String[] args) {
        BigInteger bi=new BigInteger("500000000000000000000000000000000000");
        BigInteger bi1=new BigInteger("1000000000000000000000000000000000000");
        BigInteger ans=bi.add(bi1);
        System.out.println(ans);

        int x=10;
        BigInteger a=new BigInteger(x +"");

        System.out.println(a);

        BigInteger b=new BigInteger("95834548343");
        int y=b.intValue();

        System.out.println(y);   //value is outside the range of int so change 
    }
    
}
