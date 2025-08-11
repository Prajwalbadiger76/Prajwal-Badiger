import java.util.Scanner;

public class Problem3{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int a = sc.nextInt();
    int limit;
    
    if(a % 2 == 0 ) {  //if input is even, reduce it by 1 
      limit = a-1;
    } else {
      limit = a;
    }
    
    //We can also use,
    //int limit = (a % 2 == 0) ? a - 1 : a;                         

    int num = 1;
    
    for(int i = 1; i <= limit; i++) {
        System.out.print(num);
          if(i < limit) {
              System.out.print(", ");
            }
            num += 2;  //To get next Odd number we are adding 2 to the num
        }
    }
}
