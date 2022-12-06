
package midtermexam.days.in.months;

public class MidtermExamDaysInMonths {

    public static void main(String[] args) {
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        
        System.out.print("Enter a Month: ");
        String month = sc.nextLine();
        
        if (month.equals("January ") || month.equals("March ") || month.equals("May ") || month.equals("July ") || month.equals("August ") || month.equals("October ") || month.equals("December ")) 
        {
            System.out.println(month + " has 31 days");
        }
        else if (month.equals("April ") || month.equals("June ") || month.equals("September ") || month.equals("November "))
        {
            System.out.println(month + " has 30 days");
        }
        else 
        {
            System.out.println(month + " has 28 or 29 days");
        }
         
        
    }
    
}
