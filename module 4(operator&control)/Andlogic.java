public class Andlogic {
    public static void main(String[] args){
        // int age=10; //else
        int age=20;  //true
        String city="Indian";

        if(age >=18 & city=="Indian"){   //&& called short circuit =,this is not check 2 condition if first is false
            System.out.println("may vote");
        }
        else{
            System.out.println("can not vote");
        }
    }
    
}
