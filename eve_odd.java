import java.util.*;
class eve_odd
{
    public static void main ()
    {
        Scanner tb = new Scanner (System.in);
        System.out.println ("Enter a Number");
        int a= tb.nextInt ();
        if (a%2==0)
        System.out.println("The number is even");
        else
        System.out.println ("The number is odd");
    }
}