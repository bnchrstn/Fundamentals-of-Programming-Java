
package simple.payroll.system;

public class SimplePayrollSystem {

    public static void main(String[] args) {
        
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\tWELCOME TO SIMPLE PAYROLL");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        
        java.util.Scanner scan = new java.util.Scanner(System.in);

            System.out.print("\nEnter your first name: ");
            String first = scan.nextLine();

            System.out.print("Enter your middle name: ");
            String middle = scan.nextLine();

            System.out.print("Enter your last name: ");
            String last = scan.nextLine();
            
            System.out.print("Enter your job description: ");
            String job = scan.nextLine();
            
            System.out.print("Enter your department: ");
            String depart = scan.nextLine();

            System.out.print("Hourly Rate: ");
            int hourlyrate = scan.nextInt();
            
            System.out.print("Attendance: ");
            int Attendance = scan.nextInt();
            
            
            System.out.println("\n===============================================");
            
            System.out.println("For: " + first + "" + middle + "" + last);
            System.out.println("Position: " + job);
            System.out.println("Department: " + depart);
            
            System.out.println("===============================================\n");

//            Assuming that the person works for 8 hours per day

            double sss = 531.0;
            double pagibig = 212.48;
            double philhealth = 100.0;
            double grossIncome; 
            double serviceRendered;
            double rate = 8.0; 
            double tax = 0.02;  
             
            serviceRendered = Attendance * rate;
            grossIncome = hourlyrate * rate * Attendance; 
            
            System.out.println("Attendance: " + Attendance + " days");
            System.out.println("Rate: " + hourlyrate + " per hour(s)");
            System.out.println("Service Rendered: " + serviceRendered + " hour(s)");
            
            System.out.println();
            
            System.out.println("Gross Income: " + grossIncome);
            System.out.println("Tax(2%): " + grossIncome * tax);
            System.out.println("SSS: " + sss);
            System.out.println("PagIbig: " + pagibig);
            System.out.println("PhilHealth: " + philhealth);
            
            
            System.out.println("\n-----------------------------------------------");
            
            double deduc;
            double income;
            
            deduc = grossIncome * tax + sss + pagibig + philhealth; 
            income = grossIncome - deduc;  
            
            System.out.println("Deduction: " + deduc);
            
            System.out.println("\nNet Income: " + income);
            
    }
    
}
