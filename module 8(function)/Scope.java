public class Scope {

    static void hello(){
        String s="hello everyone";
        System.out.println(s);
    }

    public static void main(String[] args) {
        int a=5;   //declear inside main  & access througth main function  so u modified value
        if(true){
            a=10;
            System.out.println("Inside a= "+a);  //10   //value modified
        }
        System.out.println("Outside a= "+a);  //10

        hello();
        // System.out.println(s);  //error bcz s in declare in hello method so scope of s only in hello method

        // if : it shows error

        // if(true){
        //         int a=10;   //inside the block this a variable is assessbla only in block  //show this block is a scope
        //         System.out.println("Inside a= "+a);  //10   //value modified
        //     }
        //     System.out.println("Outside a= "+a);  //10  //this variable is not known here
    }



    
}
