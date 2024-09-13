import java.util.Scanner;

public class LargenoFor{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int maxvalue=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            int current =sc.nextInt();
            maxvalue=Math.max(maxvalue,current);
        }
        System.out.println(maxvalue);
    }
}