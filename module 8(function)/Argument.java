public class Argument {

    static float getavg(float ...varargs){
        float total=0;
        for(float num:varargs){
            total+=num;
        }
        return total/varargs.length ;
    } 

    public static void main(String[] args) {
        Float avg1=getavg(1,5,5,2,5,2);
        Float avg2=getavg(1,5,2);

        System.out.println(avg1);
        System.out.println(avg2);


    }
    
}
