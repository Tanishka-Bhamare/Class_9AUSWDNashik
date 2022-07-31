import java.util.*;
class scanner_rect
{
    public static void main ()
    {
       Scanner tb = new Scanner (System.in);
       System.out.println("Enter Length of Rectangle");
       double l=tb.nextDouble();
       System.out.println("Enter Breadth of Rectangle");
       double b=tb.nextDouble();
       double perimeter=(2*l)+(2*b);
       double area= l*b;
       System.out.println("Perimeter is "+perimeter);
       System.out.println("Area is "+area);
    }
}