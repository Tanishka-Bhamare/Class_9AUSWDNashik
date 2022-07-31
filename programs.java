import java.util.*;
class programs
{
    public static void main ()
    {
        Scanner tb = new Scanner (System.in);
        System.out.println ("Enter Number");
        int num= tb.nextInt();
        if ((num%10==7 || num%7==0))
        {
        System.out.println("The number is a buzz number");
        }
        else
        {
        System.out.println ("The number is not a buzz number");
        }
    }
}