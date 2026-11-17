
package sef.module5.activity;

public class AbstractActivity {

    public static void main(String args[]) {

        // Create Rectangle object
        Rectangle rectangle = new Rectangle();

        rectangle.setColor("Blue");

        System.out.println("Rectangle color is: " + rectangle.getColor());

        // Rectangle area and perimeter
        System.out.println("Rectangle area is: " +
                rectangle.calculateArea(2, 4, 0));

        System.out.println("Rectangle perimeter is: " +
                rectangle.calculatePerimeter(2, 4, 0));

        System.out.println("-----------------------------");

        // Create Circle object
        Circle circle = new Circle();

        circle.setColor("Pink");

        System.out.println("Circle color is: " + circle.getColor());

        // Circle area and perimeter
        System.out.println("Circle area is: " +
                circle.calculateArea(0, 0, 5));

        System.out.println("Circle perimeter is: " +
                circle.calculatePerimeter(0, 0, 5));
    }
}
