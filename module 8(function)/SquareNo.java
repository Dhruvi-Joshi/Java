public class SquareNo{
    public static void main(String[] args){
        square(5);
        square(10);
    }

    

    //call method in main so must use static bcz main method is staic so call any method is must static
    static void square(int no){
        System.out.println(no * no);
    }
}