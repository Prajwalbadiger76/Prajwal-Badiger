import java.util.Scanner;

public class Problem2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();                  //User input for a number to the variable 'a'.

        int num = 1;                          //Starting number
        for(int i = 1; i <= a; i++) {
            System.out.print(num);            //Printing the numbers.
            if(i < a) {
                System.out.print(", ");
            }
            num = num + 2;                   //For Odd Numbers, We are adding 2 to get next Odd number. So the expected output like 1, 3, 5, 7, 9 ....
        }
    }
}
