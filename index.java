import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    String[] cars = {"Volvo", "BMW", "Tesla"};
    String[] cars2 = {"Volvo", "BMW", "Tesla"};
    
    // Returns 0 because the arrays are equal
    System.out.println(Arrays.compare(cars, cars2)); 
  }
}
