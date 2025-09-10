import java.util.Scanner;

class Employee{
    private double salary;
    private int no_of_hours;

    public void getInfo(double salary, int no_of_hours){
         this.salary = salary;
         this.no_of_hours = no_of_hours;
    }

    public void AddSal(){
        if(salary<500)
        {
            salary = salary+10;
        }
    }
    public void AddWork(){
        if(no_of_hours > 6 ){
            salary += 5;
        }
    }
     
    // Method to display final salary
    public void finalSalary() {
        System.out.println("Final Salary: $" + salary);
    }

}
public class EmployeeFinalSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee emp = new Employee();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter hours of work per day: ");
        int hours = sc.nextInt();

        emp.getInfo(salary, hours);
        emp.AddSal();
        emp.AddWork();
        emp.finalSalary();

        sc.close();
    }

    
}
