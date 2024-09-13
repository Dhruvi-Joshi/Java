public class Foreach {
    public static void main(String[] args) {
        int[] arr={1,45,65,87,89};
        int key=1;
        for(int num:arr){
            System.out.println(num);
        }

        //check whether the give value is present inside the array
        for(int num:arr){
            if(num==key){
                System.out.println("yes");
            }
        }

    }
    
}
