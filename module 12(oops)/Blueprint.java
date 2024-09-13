class Car{
    String model_name;
    String color;
    int price;
    boolean isLocked=false;

    //overload constructor
    Car(){
        System.out.println("In the defult constructor");
        model_name="Hatchback";
        color="Black";
        price=300000;
    }
    //constructor don't have any retuen type
    Car(String model,String color,int pricevalue){
        System.out.println("in the parametrised constructor");
        model_name=model;
        color=color;
        setprice(pricevalue);
        // price=pricevalue;
        // System.out.println("inside the constructor");
    }
    void drive(){
        System.out.println("zoom zomm");
    }    
    void locked(){
        isLocked=true;
        System.out.println("car is now locked");
    }  
    void unlocked(){
        isLocked=false;
        System.out.println("car is now unlocked");
    }  

    //getter and setter is use to security
    //using this we use validation on price 
    //getter for price properties
    float getprice(){
        return price;
    }

    //setter for price properties

    void setprice(int pricevalue){
        if(pricevalue <0){
            pricevalue=0;
        }
        price=pricevalue;
    }
}
public class Blueprint{
    public static void main(String[] args){
        Car c1=new Car("hatchback","black",1200000);
        Car c2=new Car();


        System.out.println(c1.model_name);
        System.out.println(c1.color);
        System.out.println(c1.price);

        System.out.println(c2.model_name);
        System.out.println(c2.color);
        System.out.println(c2.price);
        // System.out.println(c1.color);
        // System.out.println(c1.getprice());
        // c2.color="gray";
        // System.out.println(c2.color);

        // c1.drive();
        // c2.unlocked();
        // c1.locked();
        // c2.setprice(3500000);
        // System.out.println(c2.getprice());

        // System.out.println(c1.isLocked);
        // System.out.println(c2.isLocked);


    }
}