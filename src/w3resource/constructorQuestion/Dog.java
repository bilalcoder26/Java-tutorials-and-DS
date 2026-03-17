package w3resource.constructorQuestion;
/*
*Write a Java program to create a class called Dog with instance variables name and color.
* Implement a parameterized constructor that takes name and color as parameters and initializes
* the instance variables. Print the values of the variables.
 */

public class Dog {
    private String name;
    private String color;

    Dog(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        Dog myDog = new Dog("charlie", "golden");
        System.out.println("myDog Name is  :" + myDog.getName());
        System.out.println("myDog color is : " + myDog.getColor());
    }
}
