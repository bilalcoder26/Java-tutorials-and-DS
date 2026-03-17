package w3resource.objectOrientedProgrammingQuestion;
/*
Write a Java program to create a class called "Rectangle" with width and height attributes.
Calculate the area and perimeter of the rectangle.
 */

public class Rectangle {
    private double width;
    private double height;

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double areaOfRectangle(){
        return height * width;
    }
    public double perimeter(){
        return 2 * (height * width);
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle(20,60);
        System.out.println("area of rectangle : "+  rec.areaOfRectangle());
        System.out.println("perimeter : "+  rec.perimeter());

    }
}
