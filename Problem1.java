import java.util.Scanner;

public class Problem1{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.println("Enter the first number 'a' : ");
      double a = sc.nextDouble();                              //User input for the variable 'a' with the datatype double

      System.out.println("Enter the second number 'b' ");
      double b = sc.nextDouble();                              //User input for the variable 'b' with the datatype double

      System.out.println("Enter the operation (add/ sub/ mul/ div) :  ");
      String operation = sc.next();                            //User input for the variable 'operation' with the datatype String

      switch(operation.toLowerCase()) {   //Converting operation to lowercase to avoid if uppercases used in user input & using switch,to get operation to be performed.
          case "add":
                System.out.println("Result for Addition = " + (a + b));   
                break;
            case "sub":
                System.out.println("Result for Subtraction = " + (a - b));  
                break;
            case "mul":
                System.out.println("Result for Multiplication = " + (a * b));   
                break;
            case "div":
                if(b != 0) {
                    System.out.println("Result for Division = " + (a / b)); 
                } else {
                    System.out.println("Cannot divide by zero");
                }
                break;
            default:
                System.out.println("Invalid operation");     //Considering the other operations are "invlaid" except (add, sub, mul, div) for this problem.
        }
    }
}
