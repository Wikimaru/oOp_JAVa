package week8all_lab;
import java.util.Scanner;

public class Week8All_Lab {

    public static void main(String[] args) throws CloneNotSupportedException 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Progarm No : ");
        int numOfProgarm = sc.nextInt();
        switch (numOfProgarm) {
            case 1:
                Progarm1();
                break;
            case 2:
                Progarm2();
                break;
            case 3:
                Progarm3();
                break;
            case 4:
                Progarm4();
                break;
            default:
                System.out.print("oh NO Error (Not Found)");
        }
    }
    private static void Progarm1()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side1 of triangle : ");
        double side1 = sc.nextDouble();
        System.out.print("Enter the side2 of triangle : ");
        double side2 = sc.nextDouble();
        System.out.print("Enter the side3 of triangle : ");
        double side3 = sc.nextDouble();

        System.out.print("Enter the color : ");
        String color = sc.next();

        System.out.print("Enter if the Triangle filled or not? (true / false) : ");
        boolean filled = sc.nextBoolean();

        Triangle tri = new Triangle(side1, side2, side3, color, filled);

        System.out.println(tri.toString());
        sc.close();
    }
    private static void Progarm2()
    {
        Scanner sc = new Scanner(System.in);
        Square [] geometricObject = {   new Square("Red",true,3),
                                        new Square("Green",true,6),
                                        new Square("Blue",true,9),
                                        new Square("Black",true,13),
                                        new Square("White",false,69)
                                    };
        for(int i=0;i<5;i++){
            System.out.println("Area of square"+(i+1)+" : "+geometricObject[i].getArea());
            if(geometricObject[i].isFilled())geometricObject[i].howToColor();
            System.out.println();
        }
        sc.close();
    }
    private static void Progarm3()
    {
         Rectangle [] rec = {new Rectangle(2,5,"Red",true),
                            new Rectangle(2.5,4,"green",false),
                            new Rectangle(10,15,"Blue",true)
                        };

        for(int i = 0 ; i < rec.length ; i++){
            System.out.println("Rectangle" + (i+1) + rec[i].toString() + "\n");
        }

        if(rec[0].compareTo(rec[1]) == -1){
            System.out.println("Rectangle1 is equal to Rectangle2");
        }
        else{
            System.out.println("Rectangle1 is not equal to Rectangle2");
        }

        if(rec[1].compareTo(rec[2]) == -1){
            System.out.println("Rectangle2 is equal to Rectangle3");
        }
        else{
            System.out.println("Rectangle2 is not equal to Rectangle3");
        }
    }
    private static void Progarm4() throws CloneNotSupportedException
    {
        Octagon oct = new Octagon(5,"Blue",true);
        System.out.println("\n" + oct.toString());

        Octagon oct2 = (Octagon)oct.clone();

        if(oct.compareTo(oct2) == -1){
            System.out.println("Octagon(copy) is equal Octagon");
        }
        else{
            System.out.println("Octagon(copy) is not equal Octagon");
        }
    }
    
}
