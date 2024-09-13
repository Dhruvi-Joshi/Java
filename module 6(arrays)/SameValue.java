import java.util.Scanner;
import java.util.ArrayList;

public class SameValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr1={2,5,6,3,6};
        int[] arr2={1,5,5,62,3};
        int minSize = Math.min(arr1.length, arr2.length);
        int[] same = new int[minSize];
        int count = 0; 

        // int size=(arr1.length>arr2.length)?arr1.length:arr2.length;

        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i]==arr2[j]){
                    boolean isDuplicate = false;
                    for(int k=0;k<count;k++){
                        if (same[k] == arr1[i]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        same[count] = arr1[i];  // Add to 'same' array
                        count++;  // Increment the count of common elements
                    }
                }
            }
        }
        for(int i=0;i<count;i++){
            System.out.println(same[i]);
        }
    }
    
}
