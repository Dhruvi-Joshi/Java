import java.util.Scanner;
public class Reverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={2,4,6,2,3};

        reverseArray(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

        public static void reverseArray(int[] arr) {
            int start = 0;
            int end = arr.length - 1;
    
            while (start < end) {
                // Swap the elements at start and end
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
    
                // Move towards the middle
                start++;
                end--;
            }
        }

    }
    

