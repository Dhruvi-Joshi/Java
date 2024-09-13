class ComplexNo{
    int real;
    int imaginary;

    ComplexNo(int a,int b){
        real=a;
        imaginary=b;
    }

    void print(){
        //2+3i
        System.out.println(real +" + "+ imaginary +"i" );
    }

    ComplexNo add(ComplexNo y){
        int sumreal=real + y.real;
        int sumimaginary= imaginary + y.imaginary;
        ComplexNo result=new ComplexNo(sumreal, sumimaginary);
        return result;
    }
}
public class Example {

    public static void main(String[] args) {
            ComplexNo x=new ComplexNo(2,3);
            // x.real=2;
            // x.imaginary=3;
            x.print();

            ComplexNo y=new ComplexNo(-5,4);
            // y.real=-5;
            // y.imaginary=4;
            y.print();

            ComplexNo z=x.add(y);
            z.print();
            //z=x+y
    }
    
}
