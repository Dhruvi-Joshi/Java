import java.util.Scanner;
public class SquareNo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*arr[i];
            System.out.println(arr[i]);
        }
    }
    
}
