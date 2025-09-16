import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        int limit;
        
        if(a % 2 == 0) {  // if the input is even, set the limit to one less (make it odd)
            limit = a - 1;
        } else {
            limit = a;   // if the input is already odd, use it as the limit
        }
        
        // same logic in a shorter way:
        // int limit = (a % 2 == 0) ? a - 1 : a;

        int num = 1;   // starting with the first odd number
        
        for(int i = 1; i <= limit; i++) {
            System.out.print(num);   // print the current odd number
            if(i < limit) {
                System.out.print(", ");   // add a comma after each number except the last one
            }
            num += 2;   // go to the next odd number by adding 2
        }
    }
}
