class Student{
    String name;
    int roll_no;
    int phone_no;
    String address;
    
    void display(String name, int roll_no,int phone_no,String address){
        System.out.println("Name : " + name );
        System.out.println("Roll number : " + roll_no);
        System.out.println("Phone number : " + phone_no);
        System.out.println("Address : " + address);
    }

}
public class Ques2{
    public static void main(String[] args) {
        Student std1 = new Student();
        Student std2 = new Student();

        std1.display("shivam",1002,832898457,"Mumbai");
        std2.display("Omkar", 1003, 545484455, "Navi mumbai");
        
    }
}