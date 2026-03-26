package w3resource.nestedClasses;
/*

https://www.w3resource.com/java-exercises/nested-classes/java-nested-classes.php


Write a Java program to create an outer class called Computer with an inner class Processor.
The Processor class should have a method "displayDetails()" that prints the details of the processor (
e.g., brand and speed). Create an instance of Processor from the Computer class and call the "displayDetails()"
method.
 */

public class Computer {

    class Processor{
        static void displayDetails(){
            System.out.println("PROCESSOR BRAND : INTEL");
            System.out.println("PROCESS SPEED: 3.5GHZ");
        }
    }
    void showProcessorDetail(){
        //create an instance of the inner class processor
        Processor processor = new Processor();
        processor.displayDetails();
    }

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.showProcessorDetail();
    }
}
