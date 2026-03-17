package w3resource.objectOrientedProgrammingQuestion;

/*
 Write a Java program to create a class called "Person" with a name and age attribute.
 Create two instances of the "Person" class, set their attributes using the constructor,
 and print their name and age.
 */

public class Person {
    private String name;
    private  int  age;
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public String setName(String name){
        return this.name = name;
    }

    public int getAge(){
        return age;
    }

    public int setAge(int age){
        return this.age =  age;
    }

    public static void main(String[] args) {
        Person person = new Person("Bilal", 78);
        Person person1= new Person("sonu", 26);
        System.out.println("Person name : " + " " + person.getName() + " " + "and age is : " + person.getAge());
        System.out.println("Person1 name : " + " " + person1.getName() + " " + "and age is : " + person1.getAge());
        person.setAge(89);
        person1.setName("rameo");
        System.out.println("Person name : " + " " + person.getName() + " " + "and age is : " + person.getAge());
        System.out.println("Person1 name : " + " " + person1.getName() + " " + "and age is : " + person1.getAge());

    }
}
