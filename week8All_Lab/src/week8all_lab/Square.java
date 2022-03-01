package week8all_lab;

public class Square extends GeometricObject implements Colorable{
     // Attributes
    private double side;

    // Constructors
    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
        
    }

    // Methods
    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return side * 4;
    }

    public void howToColor() {
        if (isFilled()) 
        {
            System.out.println("All four sides's colour is " + getColor());
        } 
        else 
        {
            System.out.println("This square isn't filled");
        }
    }
}
