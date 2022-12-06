
package reversing.a.string.using.string.methods;

public class ReversingAStringUsingStringMethods {

    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        String reverse = "";
        System.out.print("Enter a String: ");
        String name = sc.nextLine();
                  
        for(int b = name.length()-1; b >= 0; b--)
        {
           char charPosition = name.charAt(b);
           reverse = reverse + charPosition;
        }
           System.out.println("Reversed: " + reverse.toUpperCase());       
         
    }
    
}
