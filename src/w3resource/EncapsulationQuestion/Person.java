package w3resource.EncapsulationQuestion;
/*
https://www.w3resource.com/java-exercises/encapsulation/index.php


. Write a Java program to create a class called Person with private instance variables name, age. and country.
Provide public getter and setter methods to access and modify these variables.
 */

public class Person {
    private String name;
    private int age;
    private String country;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry() {
        return country;
    }

    public static void main(String[] args) {
//        Person p1 = new Person("bILAL",89,"SWITZERLAND");
        Person p1 = new Person();
        p1.setAge(90);
        p1.setName("Bilal");
        p1.setCountry("switzerland");

        System.out.println("age : " +  p1.getAge());
        System.out.println("name : " + p1.getName());
        System.out.println("country : " + p1.getCountry());
        System.out.println("name : " + p1.getName());
        System.out.println("country : " + p1.getCountry());
    }
}
