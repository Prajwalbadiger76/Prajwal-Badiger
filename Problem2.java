import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();    // read user input and store it in 'a'

        int num = 1;             // starting with the first odd number
        for(int i = 1; i <= a; i++) {
            System.out.print(num);   // print the current number
            if(i < a) {
                System.out.print(", ");   // add a comma after each number except the last one
            }
            num = num + 2;   // move to the next odd number (increment by 2)
        }
    }
}
