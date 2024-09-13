public class Orlogic {
    public static void main(String[] args) {
        String organisation="Scaler";

        if(organisation == "Scaler" | organisation =="interviewer"){  // || is called short circuit OR ,its give true if only first statement if it is true
            System.out.println("user allow");  
        }
        else{
            System.out.println("blocked");
        }
    }
    
}
