package week5lab2;

public class Week5Lab2 {

    public static void main(String[] args) 
    {
        RegularPolygon regPol_1 = new RegularPolygon();
        RegularPolygon regPol_2 = new RegularPolygon(6, 4);
        RegularPolygon regPol_3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("The perimeter of r1: " + regPol_1.getPerimeter());
        System.out.println("The area of r1: " + regPol_1.getArea());
        System.out.println("The perimeter of r2: " + regPol_2.getPerimeter());
        System.out.println("The area of r2: " + regPol_2.getArea());
        System.out.println("The perimeter of r3: " + regPol_3.getPerimeter());
        System.out.println("The area of r3: " + regPol_3.getArea());
    }
    
}
