public class ReturnSquare {
    static int square(int no){
        return no*no;
    }

    static String[] heroes(){
        String[] superheroes={"Iron man","spiderman"};
        return superheroes;
    }

    //void=no value to return
    static void hello(){
        System.out.println("hello world");
    }
    public static void main(String[] args) {
        System.out.println(square(10));
        System.out.println(square(7));
        hello();
        String[] arr=heroes();
        for(String hero:arr){
            System.out.println(hero);
        }

    }
    
}
