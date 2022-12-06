
package string.palindrome.identifier.using.string.methods;

public class StringPalindromeIdentifierUsingStringMethods {

    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        String reverse = "";
        System.out.print("Enter the word: ");
        String name = sc.nextLine();
                  
        for(int b = name.length()-1;  b >= 0; b--)
         {
            char charPosition = name.charAt(b);
            reverse = reverse + charPosition;
         }
//            System.out.println("Reversed: " + reverse.toUpperCase());
            
        if(name.toLowerCase().equals((reverse.toLowerCase())))
            System.out.println("The word is Palindrome ");
         
        else {
            System.out.println("The word is NOT Palindrome ");
         }
        
    }
    
}
