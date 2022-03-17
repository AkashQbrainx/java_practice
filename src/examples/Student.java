package examples;

public class Student {
    int age;
    String name;
   public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    void display(){
        System.out.println(age + " " + name);
    }
}
 class Main{
    public static void main(String[] args) {
        Student student=new Student(22,"arun");
        Student student1=new Student(23,"aakash");
        student.display();
        student1.display();
    }
}
