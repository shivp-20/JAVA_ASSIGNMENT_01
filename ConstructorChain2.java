class Person{
    protected String name;
    protected int age;

    public Person(String name, int age ){
        this.name=name;
        this.age=age;
        System.out.println("name: " + name + " age : "+ age);
    }  
}
class Student extends Person{
    private String course;
    public Student(String name,int age,String course){
        super(name, age);
        this.course = course;
        System.out.println("course : "+ course);
    }
}
public class ConstructorChain2 {
    public static void main(String[] args) {
        
        Student s1 = new Student("omkar", 25, "cdac");
        
    }
    
}
