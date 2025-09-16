import java.util.*;

public class Problem4 {
    public static void main(String[] args) {
        int arr[] = {1,2,8,9,12,46,76,82,15,20,30};
   
        System.out.print("{");
        
        for(int i = 1; i <= 9; i++) { 
            int count = 0;
            for(int num : arr) {   // loop through each element of the array
                if(num % i == 0) {
                    count++;   // increase the count if the number is divisible by i
                }
            }
            System.out.print(i + ": " + count);   // print the current divisor and its count
            if(i < 9) {   // add a comma after each pair except the last one
                System.out.print(", ");
            }
        }
        System.out.print("}");
    }
}
