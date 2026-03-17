package w3resource.constructorQuestion;

/*
Write a Java program to create a class called "Cat" with instance variables name and age.
Implement a default constructor that initializes the name to "Unknown" and the age to 0.
Print the values of the variables.
 */

public class Cat {
    private String name;
    private  int age;

    //default constructor
    Cat(){
        this.name = "Unknown";
        this.age =0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void main(String[] args) {
        Cat myCat = new Cat();
        System.out.println("CAT'S name : " + myCat.getName());
        System.out.println("CAT'S age : " + myCat.getAge());
    }
}
