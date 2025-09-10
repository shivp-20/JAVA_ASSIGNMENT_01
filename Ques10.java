class Employee{
    String name;
    int year;
    int salary;
    String address;
    //constructor
    public Employee(String name,int year,int salary, String address){
        this.name = name ;
        this.year=year;
        this.salary=salary;
        this.address=address;
    }
    //display method
    void displayInfo(){
        System.out.println("Name : " + name);
        System.out.println("Year of Joining : " + year );
        System.out.println(("salary : " + salary));
        System.out.println("Address : " + address);
    }
}
public class Ques10{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Robert", 1994, 70000, " 64C- WallsStreat");
        Employee emp2 = new Employee("Sam", 2000, 600000, " 68D- WallsStreat");
        Employee emp3 = new Employee("John", 1999, 500000, "  26B- WallsStreat");
        
        emp1.displayInfo();
        emp2.displayInfo();
        emp3.displayInfo();
    }
}