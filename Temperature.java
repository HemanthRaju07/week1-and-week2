import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double fahrenheit;

       
        System.out.print("Enter temperature in Fahrenheit: ");
        fahrenheit = sc.nextDouble();

        
        double celsiusResult = (fahrenheit - 32) * 5/9;

        
        System.out.printf("The %.2f fahrenheit is %.2f celsius", fahrenheit, celsiusResult);

        sc.close();
    }
}