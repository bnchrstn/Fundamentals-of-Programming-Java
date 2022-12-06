
package midtermexam.chessboard.logic;

public class MidtermExamChessboardLogic {

    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter Letter: ");
        char letter = sc.next().charAt(0);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        
        int ascii= (int)letter; 
        
        int mod_let = ascii % 2;
        int mod_num = num % 2;
        
        if (mod_let == mod_num)
        {
            System.out.println(letter + "" + num + " is black");
        }
        else 
        {
            System.out.println(letter + "" + num + " is white");
        }
        
        
    }
    
}
