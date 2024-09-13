import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        if(x>0){
            System.out.println(x+" is positive number");
        }
        else if(x<0){
            System.out.println(x+" is nagative value");
        }
        else{
            System.out.println(x+" is zero");
        }
    }
    
}
