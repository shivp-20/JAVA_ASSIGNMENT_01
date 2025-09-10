class Student{
    String name = "john";
    int roll_no = 2;
}
public class Ques1{
    public static void main(String[] args) {
        Student std = new Student();

        System.out.println("Name: " + std.name);
        System.out.println("Roll number : " + std.roll_no);
    }
}