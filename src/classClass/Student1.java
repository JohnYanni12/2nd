package classClass;

public class Student1 {

    String name;
    String id;
    double weight;
    char gender;
    int age;

    void eat (){
        System.out.print("I'm eating Koushary");
    }
    void study(){
        System.out.print("I'm studying Java");
    }

    public static void main(String[] args) {
        Student1 Dts = new Student1();
        Dts.name = "John";
        Dts.id = "484873-99e8w";
        Dts.gender= 'M';

        Dts.study();
        Dts.eat();
        System.out.print("Student name is: "+ Dts.name+ " Gender: " +Dts.gender);
    }

}
