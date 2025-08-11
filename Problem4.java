import java.util.*;

public class Problem4{
  public static void main(String[] args) {
    int arr[] = {1,2,8,9,12,46,76,82,15,20,30};
   
    System.out.print("{");
    
    for(int i = 1; i <= 9; i++) { 
      int count = 0;
      for(int num : arr) {     //Using for each loop to get the count for each number
        if(num % i == 0) {
          count++;             //incrementing the count, if element is divisible by the value with respect to every iteration.
        }
      }
      System.out.print(i + ": " + count);    //to get output with count
      if(i < 9) {                            //If 'i' is less than than 9, we are print comma after each element or value.
        System.out.print(", ");
      }
    }
    System.out.print("}");
  }
}
