import java.util.Scanner;
//return index of value and if not than return -1
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] num=new int[5];

        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }

        int key=sc.nextInt();

        int ans=-1;
        for(int i=0;i<n;i++){
            if(num[i]==key){
                ans=i;
                break;//if break its give first occur otherwise last
            }
        }

        System.out.println(ans);
    }
}
