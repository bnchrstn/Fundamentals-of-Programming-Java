
package basic.calculator;

public class BasicCalculator {

    public static void main(String[] args) {
        
        java.util.Scanner calcu = new java.util.Scanner(System.in);
        
        System.out.println("==================================");
        System.out.println("\tBASIC CALCULATOR");
        System.out.println("==================================\n");
        
        System.out.print("Enter First Number: ");
        int num1 = calcu.nextInt(); 
        System.out.print("Enter Second Number: ");
        int num2 = calcu.nextInt();
        
        int sum = num1 + num2;
        int diff = num1 - num2;
        int prod = num1 * num2;
        int quot = num1 / num2;
        
        System.out.println("\nSUM: " + sum);
        System.out.println("DIFFERENCE: " + diff);
        System.out.println("PRODUCT: " + prod);
        System.out.println("QUOTIENT: " + quot);
    }
}