
package midtermexam.ascendingsort;

public class MidtermExamAscendingSort {

    public static void main(String[] args) {
       
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        
        int tempo; 
        
        if (b < a)
        {
            tempo = a;
            a = b;
            b = tempo;
        }
        
        if (c < b)
        {
            tempo = b;
            b = c;
            c = tempo;
        }
        
        if (b < a)
        {
            tempo = a;
            a = b;
            b = tempo;
        }
        
        System.out.println("Ascending Sort: " + a + ", " + b + ", " + c);
        
    }
    
}
