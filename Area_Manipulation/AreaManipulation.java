package areamanipulation;

import java.util.Scanner;

public class AreaManipulation {

    public static void main(String[] args) {
      int ch;
        
        Scanner sc = new Scanner(System.in);
        Area abc = new Area();
        
        System.out.print("1 for Circle");
        System.out.print("\n2 for Square");
        System.out.print("\n3 for Rectangle");
        System.out.print("\n4 for Triangle");
        System.out.print("\nEnter your choice : ");
        
        ch = sc.nextInt();
        
        switch(ch)
        {
            case 1:
                System.out.print("\nEnter Radius of the Circle : ");
                double radius = sc.nextDouble();
                abc.areaCircle(radius);
                System.out.print("\nArea : " + abc.getArea());
                break;
            case 2:
                System.out.print("\nEnter the length of a side : ");
                int length = sc.nextInt();
                abc.areaSquare(length);
                System.out.print("\nArea : " + abc.getArea());
                break;
            case 3:
                System.out.print("\nEnter the length : ");
                int Rectlength = sc.nextInt();
                System.out.print("\nEnter the Width : ");
                int Rectwidth = sc.nextInt();                
                abc.areaRectangle(Rectlength, Rectwidth);
                System.out.print("\nArea : " + abc.getArea());
                break;
            case 4:
                System.out.print("\nEnter the length of side A : ");
                int a = sc.nextInt();
                System.out.print("\nEnter the length of side B : ");
                int b = sc.nextInt();                
                System.out.print("\nEnter the length of side C : ");
                int c = sc.nextInt();                
                abc.areaTriangle(a, b, c);
                System.out.print("\nArea : " + abc.getArea());
                break;
        }
    }
    
}
