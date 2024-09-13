import java.util.Scanner;

public class Cal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        int r=sc.nextInt();
        int t=sc.nextInt();

        int ans=(p*r*t)/100;
        System.out.println("simple intrest:" +ans);
    }
}