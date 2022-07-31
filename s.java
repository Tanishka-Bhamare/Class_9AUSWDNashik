//1-add,2-sub,3-mult,4-div
import java.util.*;
class s
{
    public static void main()
    {
        Scanner tb =  new Scanner (System.in);
        System.out.println("Enter num1");
        int a= tb.nextInt();
        System.out.println("Enter num2");
        int b= tb.nextInt();
        System.out.println("Select choice to: 1-add,2-sub,3-mult,4-div");
        System.out.println("Enter user choice");
        int c= tb.nextInt();
        switch (c)
        {
            case 1:
                System.out.println("Addition is "+((double)a+b));
                break;
                case 2:
                System.out.println("Subtraction is "+((double)a-b));
                break;
                case 3:
                System.out.println("Multiplication is "+((double)a*b));
                break;
                case 4:
                System.out.println("Division is "+((double)a/b));
                break;
                default:
                    System.out.println("Invalid choice");
        }
    }
}