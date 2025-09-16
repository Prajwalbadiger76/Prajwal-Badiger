public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter the first number 'a' : ");
        double a = sc.nextDouble();    // taking user input for 'a' (a decimal or whole number)

        System.out.println("Enter the second number 'b' ");
        double b = sc.nextDouble();    // taking user input for 'b' (a decimal or whole number)

        System.out.println("Enter the operation (add/ sub/ mul/ div) :  ");
        String operation = sc.next();  // taking user input for the operation as a string

        // converting the operation to lowercase to handle both upper/lower case inputs
        // and using switch to decide which calculation to perform
        switch(operation.toLowerCase()) {   
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
                // if the user enters something other than add, sub, mul, div
                System.out.println("Invalid operation");     
        }
    }
}
