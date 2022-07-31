//days of week
import java.util.*;
class days
{
    public static void main()
    {
        Scanner tb =  new Scanner (System.in);
        System.out.println("Enter user choice");
        int c= tb.nextInt();
        switch (c)
        {
            case 1:
                System.out.println("Its Monday");
                break;
                case 2:
                System.out.println("Its Tuesday");
                break;
                case 3:
                System.out.println("Its Wednesday");
                break;
                case 4:
                System.out.println("Its Thursday");
                break;
                case 5:
                System.out.println("Its Friday");
                break;
                case 6:
                System.out.println("Its Saturday");
                break;
                case 7:
                System.out.println("Its Sunday");
                break;
        }
    }
}