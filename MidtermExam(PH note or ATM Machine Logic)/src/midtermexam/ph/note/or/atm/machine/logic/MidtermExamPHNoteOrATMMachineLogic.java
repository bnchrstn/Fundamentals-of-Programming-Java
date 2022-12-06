
package midtermexam.ph.note.or.atm.machine.logic;

public class MidtermExamPHNoteOrATMMachineLogic {

    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter The Amount: ");
        int amount = sc.nextInt(); 
        System.out.println("\nYour amount contains the following: ");
        
        int note; 
        
        if (amount > 999)
        {
            note = amount / 1000;
            amount = amount - note * 1000;
            System.out.println("1000 Peso Bill:\t" + note + "\t Total: " + note * 1000);
        }
        
        if (amount > 499)
        {
            note = amount / 500;
            amount = amount - note * 500;
            System.out.println("500 Peso Bill:\t" + note + "\t Total: " + note * 500 );
        }
        
         if (amount > 99)
        {
            note = amount / 100;
            amount = amount - note * 100;
            System.out.println("100 Peso Bill:\t" + note + "\t Total: " + note * 100 );
        }
         
        if (amount > 49)
        {
            note = amount / 50;
            amount = amount - note * 50;
            System.out.println("50 Peso Bill:\t" + note + "\t Total: " + note * 50 );
        }
        
        if (amount > 19)
        {
            note = amount / 20;
            amount = amount - note * 20;
            System.out.println("20 Peso Bill:\t" + note + "\t Total: " + note * 20 );
        }
        
        if (amount > 9)
        {
            note = amount / 10;
            amount = amount - note * 10;
            System.out.println("10 Peso Bill:\t" + note + "\t Total: " + note * 10 );
        }
         
        if (amount > 1)
        {
            note = amount / 1;
            amount = amount - note * 1;
            System.out.println("1 Peso Bill:\t" + note + "\t Total: " + note * 1 );
        }
         
    }
}
