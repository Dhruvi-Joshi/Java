class ComplexNo{
    int real;
    int imaginary;

    //this tell java we are try ro refer inhance variable 
    //without this is local variable
    ComplexNo(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }

    void print(){
        //2+3i
        System.out.println("this:"+this);   //ComplexNo@2f92e0f4
        System.out.println(real +" + "+ imaginary +"i" );
    }

    ComplexNo add(ComplexNo y){
        int sumreal=real + y.real;
        int sumimaginary= imaginary + y.imaginary;
        ComplexNo result=new ComplexNo(sumreal, sumimaginary);
        return result;
    }

    public String toString(){
        return real +" + "+ imaginary +"i" ;
    }
}

public class ThisKeyword {

    public static void main(String[] args) {
        ComplexNo x=new ComplexNo(2,3);
        // x.real=2;
        // x.imaginary=3;
        // x.print();
        // System.out.println("x="+x);  //x=ComplexNo@31befd9f
        System.out.println(x);

        ComplexNo y=new ComplexNo(-5,4);
        // // y.real=-5;
        // // y.imaginary=4;
        // y.print();
        System.out.println(y);

        ComplexNo z=x.add(y);
        // z.print();
        // //z=x+y

        System.out.println(z);  //to string
}
    
}
