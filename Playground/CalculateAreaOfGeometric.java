import java.util.Scanner;

public class CalculateAreaOfGeometric {

    static void SquareOfShape() {
        System.out.println("Does nothing");
    }

    static int SquareOfShape(int side) {
        return side*side;
    }

    static int SquareOfShape(int length, int breadth) {
        return length*breadth;
    }

    static double SquareOfShape(double radius) {
        return 3.14*radius*radius;
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        int side = scan.nextInt();
        System.out.println("Area of square: "+ SquareOfShape(side));

        System.out.print("Enter length and breadth of rectangle: ");
        int length = scan.nextInt();
        int breadth = scan.nextInt();
        System.out.println("Area of rectangle: "+ SquareOfShape(length, breadth));

        System.out.print("Enter radius of circle: ");
        double radius = scan.nextDouble();
        System.out.println("Area of square: "+ SquareOfShape(radius));
        
        scan.close();
    }
}
