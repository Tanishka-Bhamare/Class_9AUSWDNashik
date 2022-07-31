import java.util.*;
class rect_sq
{
    public static void main()
    {
        Scanner tb =  new Scanner(System.in);
        System.out.println("a-for Rectangle, b-for Square");
        System.out.println("Enter User choice");
        char z= tb.next().charAt(0);
        switch(z)
        {
            case 'a':
        System.out.println("Enter Length");
        double l=tb.nextDouble();
        System.out.println("Enter Breadth");
        double b=tb.nextDouble();
        System.out.println("1-for Area and 2-for Perimeter");
        System.out.println("Enter user choice");
        int d=tb.nextInt();
        double ar,pr;
        ar=l*b;
        pr=2*(l+b);
        switch (d)
        {
            case 1:
        System.out.println("Area of Rectangle is "+(double)ar);
        break;
        case 2:
        System.out.println("Perimeter of Rectangle is "+(double)pr);
        break;
        default:
            System.out.println("Wrong choice");    
        }
        break;
        case 'b':
        System.out.println("Enter side");
        double s=tb.nextDouble();
        System.out.println("1-area, 2-perimeter");
        System.out.println("Enter user choice");
        int c= tb.nextInt();
        double as,ps;
        as=s*s;
        ps=4*s;
        switch (c)
        {
            case 1:
        System.out.println("Area of Square is "+(double)as);
        break;
        case 2:
        System.out.println("Perimeter of Square is "+(double)ps);
        break;
        default:
            System.out.println("Wrong choice");
        }
    }
}
}