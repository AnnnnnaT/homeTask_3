import java.util.*;

public class PowerCalculator{
    public static void main (String args[]){
        
        try {
           double num1 = getVal("Input the number to be raised to the power:");
           double num2 = getVal("Input the exponent of the number:");
           System.out.println("Result is " + CalculatePower(num1, num2));
        } catch (InvalidInputException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static double getVal(String message) {
    Scanner iscan = new Scanner(System.in);
    while(true){
        try {     
            System.out.println(message);
            if(iscan.hasNext()){
            return iscan.nextDouble();
        }else{
            iscan.close();
        }
        }catch (InputMismatchException ex) {
                System.out.println("Your number is incorrect ");
                iscan.next();
        }
      }
    }

    
    public static double CalculatePower(double num1, double num2) throws InvalidInputException{
        if(num1 == 0 && num2 < 0){
            throw new InvalidInputException("The exponent of a number cannot be negative if the base is 0");
        }
        return Math.pow(num1, num2);
    }

   public static class InvalidInputException extends Exception{

        public InvalidInputException(String mes){
            super(mes);
        }
   }

}