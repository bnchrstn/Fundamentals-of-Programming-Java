
package advance.calculator;

public class AdvanceCalculator {

    public static void main(String[] args) {
       
        java.util.Scanner scan = new java.util.Scanner(System.in);
        
        System.out.println("========================================");
        System.out.println("\t MEDYO ADVANCE CALCULATOR");
        System.out.println("========================================");
        
        System.out.print("\nEnter first number: ");
        double num1 = scan.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scan.nextDouble();
        
        System.out.println("\nFor addition enter <+>");
        System.out.println("For subtraction enter <->");
        System.out.println("For multiplication enter <*>");
        System.out.println("For division enter </>");
        
        System.out.print("\nEnter the operation: ");
        char ope = scan.next().charAt(0);
       
        if (ope == '+') {
            double sum = num1 + num2;
            System.out.println("\nAnswer: " + " " + num1 + " " + ope + " " + num2 + " = " + sum);
        }
        if (ope == '-') {
            double diff = num1 - num2;
            System.out.println("\nAnswer: " + " " + num1 + " " + ope + " " + num2 + " = " + diff);
        }
        if (ope == '*') {
            double prod = num1 * num2;
            System.out.println("\nAnswer: " + " " + num1 + " " + ope + " " + num2 + " = " + prod);
        }
        if (ope == '/') {
            double quot = num1 / num2;
            System.out.println("\nAnswer: " + " " + num1 + " " + ope + " " + num2 + " = " + quot);
        }
       
    }
    
}
