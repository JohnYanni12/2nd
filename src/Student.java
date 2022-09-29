public class Student {

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
        Student Dts = new Student();
        Dts.name = "John";
        Dts.id = "484873-99e8w";
        Dts.gender= 'M';

        Dts.study();
        Dts.eat();
        System.out.print("Student name is: "+ Dts.name+ " Gender: " +Dts.gender);


        System.out.println();
        System.out.println();


        );
    }
}

